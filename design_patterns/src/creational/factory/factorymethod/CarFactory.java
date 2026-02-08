package creational.factory.factorymethod;

import creational.factory.Car;

public abstract class CarFactory {
     protected abstract Car createCar();
     public Car getCar(){
         return createCar();
     }
}
