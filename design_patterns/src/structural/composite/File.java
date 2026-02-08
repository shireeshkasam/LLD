package structural.composite;

public class File implements StorageComponent{
    private final String name;

    File(String name){
        this.name = name;
    }
    @Override
    public void ls() {
        System.out.println(name);
    }
}
