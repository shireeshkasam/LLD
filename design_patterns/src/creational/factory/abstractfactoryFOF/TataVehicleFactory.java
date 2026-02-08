package creational.factory.abstractfactoryFOF;

import creational.factory.Car;
import creational.factory.Tata;

public class TataVehicleFactory extends VehicleFactory{
    @Override
    Car createCar() {
        return new Tata();
    }

    @Override
    Engine createEngine() {
        return new TataEngine();
    }
}
