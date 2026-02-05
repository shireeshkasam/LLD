package solid.lsp.violation;

public class Peguin extends Bird{

    @Override
    void fly() {
        throw new RuntimeException();
    }

    @Override
    void eat() {
        System.out.println("Eating penguin");
    }
}
