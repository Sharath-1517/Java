package CoreJavaConcepts.Inheritance;

public class SUV extends Vehicle {

    private String make, model;
    private int year;

    public static void suvRenting(){
        System.out.printf("%d - Successfully rented a SUV.", rentSuccessful()); // Displays 200 in console
    }

    public static void suvReturn() {
        System.out.printf("%d - Successfully returned the SUV.", vehileReturn());
    }

}
