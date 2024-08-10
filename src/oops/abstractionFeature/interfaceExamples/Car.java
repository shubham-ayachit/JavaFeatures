package oops.abstractionFeature.interfaceExamples;

public class Car implements Vehical{

    @Override
    public void start() {
        System.out.println("Car is starting using key");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping switch.");
    }

    @Override
    public void brake() {
        System.out.println("Car has breaks can be used by feet only.");
    }

}