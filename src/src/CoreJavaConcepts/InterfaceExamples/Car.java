package CoreJavaConcepts.InterfaceExamples;

public class Car implements Brake, Engine, EngineActions{
    @Override
    public void brake() {
        System.out.println("Simple car is being braked");
    }

    @Override
    public void rev() {
        System.out.println("Simple car is being reved");
    }

    @Override
    public void start() {
        System.out.println("Simple car is being started");
    }

    @Override
    public void acc() {
        System.out.println("Simple car is being accelerated");
    }

    @Override
    public void stop() {
        System.out.println("Simple car is being stopped");
    }
}
