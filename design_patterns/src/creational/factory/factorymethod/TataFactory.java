package creational.factory.factorymethod;

import creational.factory.Car;
import creational.factory.Tata;

public class TataFactory extends CarFactory{
    @Override
    protected Car createCar() {
        return new Tata();
    }
}
