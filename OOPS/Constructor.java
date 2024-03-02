package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Animal p1 = new  Animal("Tigar"); // calling the constructor of the class 'Pen' by creating an object of it.
        System.out.println("Name " +p1.name);
    }
}
class Animal{
    String name;
    int size;

    Animal(String name){
        this.name = name;
        System.out.println( "I am a default constructor" );
        this.size=0;
    }
}