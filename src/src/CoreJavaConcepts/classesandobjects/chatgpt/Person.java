package CoreJavaConcepts.classesandobjects.chatgpt;


//Create a class called "Person" with fields for name, age, and gender. Write a constructor that takes in these fields
// as arguments and initializes the corresponding fields. Also, write methods to set and get the values of these fields.

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {

//      Object creation
        Person p1 = new Person("Sharath", 20,"male");
        Person p2 = new Person("Tharun", 17, "male");

//      Getting the values from the objects
        System.out.printf("Name: %s\nAge: %d\nGender: %s\n\n", p1.getName(), p1.getAge(), p1.getGender());
        System.out.printf("Name: %s\nAge: %d\nGender: %s\n\n\n", p2.getName(), p2.getAge(), p2.getGender());

//      Setting the values to the objects
        p1.setName("Tharun");
        p1.setAge(17);
        p1.setGender("male");

        p2.setName("Sharath");
        p2.setAge(20);
        p2.setGender("male");


//      Checking for the values after the change
        System.out.printf("Name: %s\nAge: %d\nGender: %s\n\n", p1.getName(), p1.getAge(), p1.getGender());
        System.out.printf("Name: %s\nAge: %d\nGender: %s\n\n\n", p2.getName(), p2.getAge(), p2.getGender());
    }
}

//OUTPUT//==============================================================================================================

//        Name: Sharath
//        Age: 20
//        Gender: male
//
//        Name: Tharun
//        Age: 17
//        Gender: male
//
//
//        Name: Tharun
//        Age: 17
//        Gender: male
//
//        Name: Sharath
//        Age: 20
//        Gender: male

//======================================================================================================================