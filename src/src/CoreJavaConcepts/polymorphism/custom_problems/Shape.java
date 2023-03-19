package CoreJavaConcepts.polymorphism.custom_problems;

import java.util.Scanner;

public class Shape {

    public double getArea() {
        System.out.println("I am the super class " + new Shape());
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius for the circle: ");
        double radius = sc.nextDouble();

        System.out.println("\nEnter the Height and Breadth of the triangle:");
        System.out.print("Height: "); double height = sc.nextDouble();
        System.out.print("Breadth: "); double breadth = sc.nextDouble();

//        Object declarations for the subclasses,

        Shape circle = new Circle(radius);
        Shape triangle = new Triangle(height, breadth);


        System.out.printf("The area of circle of the given radius %.2f is %.2f \n\n", radius, circle.getArea());
        System.out.printf("The area of triangle of the given height %.2f and breadth %.2f is %.2f", height, breadth, triangle.getArea());

    }
}






class Circle extends Shape{

    private double radius;
    private double r_square;
    public Circle(double radius) {
            this.radius = radius;
            r_square = radius * radius;
    }
    private final double pi = Math.PI;


    @Override
    public double getArea() {
        return (pi * r_square);
    }

}



class Triangle extends Shape {
    private double height, breadth;
    public Triangle(double height, double breadth) {
        this.height = height;
        this.breadth = breadth;
    }
    @Override
    public double getArea() {
        return (0.5 * height * breadth);
    }
}