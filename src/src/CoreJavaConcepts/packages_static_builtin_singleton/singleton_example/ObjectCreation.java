package CoreJavaConcepts.packages_static_builtin_singleton.singleton_example;

public class ObjectCreation {
    public static void main(String[] args) {

        Settings object1 = Settings.getInstance(); // This is the original object
        Settings object2 = Settings.getInstance(); //Whereas object2,3,4 are the same instances of the object1.
        Settings object3 = Settings.getInstance();
        Settings object4 = Settings.getInstance();

    }
}
