package creational.factory.simplefactory;

import creational.factory.Car;

public class Client {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Hyundai");
        car.drive();
    }
}
