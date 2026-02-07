package creational.prototype;

public interface Registry <T, R>{
    void register(T t);
    T clone(R r);
}
