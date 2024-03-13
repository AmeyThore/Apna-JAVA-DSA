package OOPS;

public class SuperKeyword{
    SuperKeyword(){
        System.out.println("Super class consuructor is called");
    }

    static class  SubClass extends SuperKeyword {
        SubClass(){
            super(); // calling the constructor of the super
            System.out.println("Subclass cunstructor is called");
        }
    }

    public static void main(String[] args) {
        SubClass s1 = new SubClass();

    }
}