package structural.bridge;

public class Client {
    public static void main(String[] args) {
        Car suvP = new SUV(new Petrol());
        Car suvD = new SUV(new Diesel());
        Car sedanP = new Sedan(new Petrol());
        suvD.drive();
        suvP.drive();
        sedanP.drive();
    }
}
