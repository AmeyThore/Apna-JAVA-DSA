package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen() ;  //creating object of the class "Pen" and assigning it to variable "p1".
        // System.out.println(p1);   //calling the method "toString()" using system out println().
        
        p1.setColor("Blue");     //using setter method to set color as "Blue".
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Yellow";
        p1.tip = 9;

        System.out.println("\nAfter setting values directly : ");
        System.out.println(p1.color + "\t\t" + p1.tip);

        BankAccount SBI = new BankAccount();
        SBI.Username = "Amey Thore"     ;
        //SBI.passward = "AmeY@1234"; show error of not visible
        //So
        SBI.setPass(546366266);      //Using setter method to set password.
        //range of int in java is 
    }

}
class BankAccount{
    private int passward;
    public String Username;

    public void setPass(int newPwd){
        passward = newPwd;
    }



}
class Pen{
    int tip;
    String color;

    void setTip(int newTip){
        tip = newTip;
    }
    void setColor(String newColor){
        color = newColor;
    }
    
    // Method to display the attributes of a pen.
    // void showAttributes(){
    //     System.out.println("The tip of this pen is " + tip);
    //     System.out.println("The color of this pen is " + color);
    // }
}
// class  Animal{
//     String name;
//     int age;
    
//     // constructor
//     public Animal (String name,int age){
//         this.name = name;
//         this.age = age;
//     }

//     // method
//     public void eat(){
//         System.out.println("Eating...");
//     }   

//     // overriding the method of super class in subclass
//     @Override
//     public String toString() {
//        return "Name : "+this.name+"\nAge : "+this.age;
//     }    
// }

// // SubClass - Dog
// class Dog extends Animal{
  
//     // additional field for dog
//     String breed;

//     // constructor
//     public Dog(String name, int age, String breed) {
//         super(name, age);
//         this.breed = breed;
//     }

//     // overrriding the method of super class in sub class
//     @Override
//     public void eat() {
//         System.out.println("Dog is eating from bone.");
//     }

//     // calling the method of super class using super keyword 
//     public void showInfo(){
//         System.out.println("Breed : "+super.toString());
//     }

//     @Override
//     public String toString() {
//         return super.toString() + "\nBreed : "+this.breed;
//     }                
// }
