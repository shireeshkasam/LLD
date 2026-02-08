package structural.bridge;

public class SUV implements Car {
    protected Fuel fuel;
    public SUV(Fuel fuel){
        this.fuel = fuel;
    }

    @Override
    public void drive() {
        fuel.consume();
        System.out.println("SUV is running...");
    }
}
