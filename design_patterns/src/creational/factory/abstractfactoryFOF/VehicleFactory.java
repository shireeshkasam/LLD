package creational.factory.abstractfactoryFOF;

import creational.factory.Car;

public abstract class VehicleFactory {
    abstract Car createCar();
    abstract Engine createEngine();

    protected Car getCar(){
        return createCar();
    }
    protected Engine getEngine(){
        return createEngine();
    }
}
