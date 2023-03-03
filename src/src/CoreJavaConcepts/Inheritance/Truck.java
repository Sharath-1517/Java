package CoreJavaConcepts.Inheritance;

public class Truck extends Vehicle{

    private String make, model;
    private int year;

    public static void truckRenting(){

        System.out.printf("%d - Successfully rented a truck.", rentSuccessful());

    }

    public static void truckReturn() {

        System.out.printf("%d - Successfully returned the truck.", vehileReturn());
    }

}
