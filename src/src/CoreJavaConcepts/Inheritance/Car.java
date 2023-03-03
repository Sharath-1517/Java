package CoreJavaConcepts.Inheritance;

public class Car extends Vehicle{

    private String make, model;
    private int year;

    public static void carRenting(){

        System.out.printf("%d - Successfully rented a car.", rentSuccessful()); // Displays 200 in console

    }

    public static void carReturn() {

        System.out.printf("%d - Successfully returned the returned.", vehileReturn());

    }

}
