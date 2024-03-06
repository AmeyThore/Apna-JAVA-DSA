package OOPS;

public class Animalinheritance {
    String eats;
    String Color;

    void eat() {
        System.out.println("Eating");
    }

    void color() {
        System.out.println("Golden");
    }

    static class Fish extends Animalinheritance {

        String fins;
        String eats;

        void swim() {
            System.out.println("slur slur");
        }

        void color() {
            System.out.println(this.Color);
        }

    }

    public static void main(String[] args) {
        Fish Shark = new Animalinheritance.Fish();
        // Shark.eats = "Fish";
        Shark.Color = "Gray";
        Shark.color();
        Shark.eat();
    }
}
// Java program to illustrate the
// concept of inheritance


