package structural.bridge;

public class Sedan implements Car{
    protected Fuel fuel;
    public Sedan(Fuel fuel){
        this.fuel = fuel;
    }

    @Override
    public void drive() {
        fuel.consume();
        System.out.println("Driving Sedan... ");
    }
}
