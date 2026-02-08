package creational.factory.simplefactory;

import creational.factory.Car;
import creational.factory.Hyundai;
import creational.factory.Tata;

public class CarFactory {
    public static Car getCar(String type){
        if(type.equals("Hyundai")){
            return new Hyundai();
        }
        else if(type.equals("Tata")) {
            return new Tata();
        }

        throw new IllegalArgumentException();
    }
}
