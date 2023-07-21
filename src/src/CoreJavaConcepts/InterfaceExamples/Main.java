package CoreJavaConcepts.InterfaceExamples;

public class Main {

    public static void main(String[] args) {

//      This below line is to check for instantiation.
        Car car = new Car();
        car.acc();

//      This below line is to check for doubts in Interfaces can't be instantiated since interfaces are final static by normally.
        Engine car2 = new Car();
        car2.stop(); // this is an error because the Engine defines what should the object use and the Car() in the "Engine car2 = new Car()" describes the type of the function that has to be used.

    }

}
