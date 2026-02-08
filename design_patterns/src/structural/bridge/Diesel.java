package structural.bridge;

public class Diesel implements Fuel{
    @Override
    public void consume() {
        System.out.println("Consuming Diesel...");
    }
}
