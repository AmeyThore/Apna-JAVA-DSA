package OOPS;

public class Person {

    // Instance variables
    private String name;
    private int age;
    private boolean isStudent;

    // No-argument constructor (default constructor)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.isStudent = false;
    }

    // Constructor taking name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.isStudent = false;
    }

    // Constructor taking name, age, and student status
    public Person(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student: " + isStudent);
    }

    // Main method to create and test Person objects
    public static void main(String[] args) {
        Person person1 = new Person();  // Calls the no-argument constructor
        Person person2 = new Person("Alice", 30);  // Calls the constructor with name and age
        Person person3 = new Person("Bob", 25, true);  // Calls the constructor with all three parameters

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}
