package CoreJavaConcepts.Inheritance;

public class Vehicle {

    public static int rentSuccessful() {
        return 200; // I have used 200 here because 2** [2 series messages are success messages].
    }

    public  static int vehileReturn() {

        return 200; // I have used 200 here because 2** [2 series messages are success messages].

    }

    public static void main(String[] args) {

        Truck truck = new Truck();

        Truck.truckRenting();
        Car.carRenting();
        SUV.suvRenting();

        System.out.println("\n\nCar return status:==========");

        Truck.truckReturn();
//        System.out.println(Car.carReturn());
//        System.out.println(SUV.suvReturn());

        System.out.println("===========***==========End==========***=======");

    }

}
