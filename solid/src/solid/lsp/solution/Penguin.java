package solid.lsp.solution;

public class Penguin extends Bird implements Eater {
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
}