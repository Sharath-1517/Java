package CoreJavaConcepts.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes rectangle = new Rectangle();
        Shapes triangle = new Triangle();
        shape.area();
        circle.area();
        square.area();
        rectangle.area();
        triangle.area();
    }
}