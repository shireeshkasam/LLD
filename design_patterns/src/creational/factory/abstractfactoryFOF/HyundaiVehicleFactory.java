package creational.factory.abstractfactoryFOF;

import creational.factory.Car;
import creational.factory.Hyundai;

public class HyundaiVehicleFactory extends VehicleFactory {
    @Override
    protected Car createCar() {
        return new Hyundai();
    }

    @Override
    protected Engine createEngine() {
        return new HyundaiEngine();
    }
}
