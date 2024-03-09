package OOPS;

abstract class Abstraction {
    //Consider class as a Animal // super class
    String color;
    //Constuctor in Abstraction
    Abstraction(){
        color = "Black";
    }
    
    void eat(){
        System.out.println("vegiterian");
    }

    abstract void walk();//Abstract fuction that must be defined in the every sub class

    static class  Dog extends Abstraction{//child class
        void changecolor(){
            color = "yellow";
        }

        @Override
        void walk() {
            System.out.println("Walk with 4 legs");
        }

    }
    static class chiken extends Abstraction{
        void changecolor(){
            color = "Red";
        }
        void walk(){
            System.out.println("Walk with 2 legs");
        }
    }

    public static void main(String[] args) {
        Dog husky = new Abstraction.Dog();
        husky.eat();
        husky.walk();
        System.out.println(husky.color);// it is gonna print black as it is a abstract class it always print a superclass 

        chiken chiku = new Abstraction.chiken();
        chiku.eat();
        chiku.walk();
        System.out.println(chiku.color);
        // Abstraction ab = new Abstraction() = it will show an error when class is absracted


    }
}
