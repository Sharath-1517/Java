package CoreJavaConcepts.polymorphism;

public class Circle extends Shapes{

    @Override
    void area() {
        System.out.println("Area of circle is pi * r * r.");
    }

}
