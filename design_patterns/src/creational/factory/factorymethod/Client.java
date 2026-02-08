package creational.factory.factorymethod;

import creational.factory.Car;

public class Client {
    public static void main(String[] args) {
        Car car = new TataFactory().getCar();
        car.drive();
    }
}
