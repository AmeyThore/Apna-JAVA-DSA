package OOPS;

public class Person {
    private String name;
    private int age;
  
    // Getter for name
    public String getName() {
      return name;
    }
  
    // Setter for name
    public void setName(String newName) {
      name = newName;
    }
  
    // Getter for age
    public int getAge() {
      return age;
    }
  
    // Setter for age with basic validation
    public void setAge(int newAge) {
      if (newAge >= 0) {
        age = newAge;
      } else {
        System.out.println("Error: Age cannot be negative.");
      }
    }
  
    // (Optional) Example usage in main method
    public static void main(String[] args) {
      Person person = new Person();
      person.setName("John Doe");
      person.setAge(30);
  
      System.out.println("Person name: " + person.getName());
      System.out.println("Person age: " + person.getAge());
    }
  }
  