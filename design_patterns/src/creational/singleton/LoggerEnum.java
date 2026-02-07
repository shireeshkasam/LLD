package creational.singleton;

public enum LoggerEnum {
    INSTANCE;
    public void log(String s){
        System.out.println(s);
    }
}
// Invocation from mail looks like this:
//static void main() {
//    LoggerEnum.INSTANCE.log("Hello");
//}
