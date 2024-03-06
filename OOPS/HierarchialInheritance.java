
package OOPS;

public class HierarchialInheritance { // Fixed typo in class name: HierarchicalInheritance
    // Consider Base class Animal
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breath() {
        System.out.println("air");
    }

    static class Mammal extends HierarchialInheritance { // Removed unnecessary comment and fixed the extends statement
        void walk() {
            System.out.println("walk");
        }
    }

    static class Fish extends HierarchialInheritance {
        void swim() {
            System.out.println("swim");
        }
    }

    static class Dog extends HierarchialInheritance {
        void bark() {
            System.out.println("bark");
        }
    }

    public static void main(String[] args) {
        // creating object of mammal
        Mammal m = new Mammal(); // Removed HierarchicalInheritance prefix
        m.eat();
        m.breath(); // Corrected access to breath method
        m.walk();

        // creating object of fish
        Fish f = new Fish(); // Removed HierarchicalInheritance prefix
        f.eat();
    }
}
