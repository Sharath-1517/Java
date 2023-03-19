package CoreJavaConcepts.polymorphism.custom_problems;

//Create a class called Animal with a method called makeSound(). Then, create two subclasses of Animal called Dog and Cat.
// In each subclass, override the makeSound() method to print out the sound that each animal makes.

public class Animal {

    public void makeSound() {
        System.out.print("Animals sound like this");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

}

class Dog extends Animal {

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(" Dogs Bark...");
    }

}

class Cat extends Animal {

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(" Cats Meows...");
    }
}