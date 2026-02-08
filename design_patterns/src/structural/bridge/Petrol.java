package structural.bridge;

public class Petrol implements Fuel {

    @Override
    public void consume() {
        System.out.println("Consuming Petrol...");
    }
}
