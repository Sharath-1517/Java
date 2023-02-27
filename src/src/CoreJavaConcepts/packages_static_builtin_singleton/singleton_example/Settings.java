package CoreJavaConcepts.packages_static_builtin_singleton.singleton_example;


// Create a singleton class called "Settings" that holds application settings like language, theme, and font size.
// The class should have methods to get and set these settings.

public class Settings {

    private Settings() {

    }

    private static Settings instance;

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
            return instance;
        }

        System.out.println("This is same instance of the first object created");
        return instance;
    }
}
