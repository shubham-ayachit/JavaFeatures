package oops.abstractionFeature.interfaceExamples;

public class InterfaceExampleMain {

    public static void main(String[] args) {
        
        Vehical bike = new Bike();
        bike.start();
        bike.stop();
        bike.brake();
        
        Vehical car = new Car();
        car.start();
        car.stop();
        car.brake();
    }
}
