package structural.composite;

public class Client {

    public static void main(String[] args) {
        Folder folder = new Folder("abc");
        StorageComponent f = new File("f1");
        folder.add(f);
        folder.ls();
    }
}
