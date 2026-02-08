package creational.factory.factorymethod;

import creational.factory.Car;
import creational.factory.Hyundai;

public class HyundaiFactory extends CarFactory{

    @Override
    protected Car createCar() {
        return new Hyundai();
    }
}
