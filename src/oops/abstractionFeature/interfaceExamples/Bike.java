package oops.abstractionFeature.interfaceExamples;

public class Bike implements Vehical{

    @Override
    public void start() {
        System.out.println("Bike is starting using kick.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping using key.");
    }

    @Override
    public void brake() {
        System.out.println("Bike has breaks can be used by hands.");
    }

}
