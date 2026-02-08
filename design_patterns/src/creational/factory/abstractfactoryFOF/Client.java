package creational.factory.abstractfactoryFOF;

import creational.factory.Car;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new TataVehicleFactory();
        Car car = vehicleFactory.getCar();
        Engine engine = vehicleFactory.createEngine();
        car.drive();
        engine.start();
    }
}
