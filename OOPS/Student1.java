package OOPS;

public class Student1 {

    String name;
    int  age;
    int marks[];

    //Shallow copy = prints changes in the s2  object also reflects in the s1 object.

    // Student1(Student1 s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    //       }

    //Deep Copy = do not prints the change in the s2  object, it only copies the reference of the array
    Student1(Student1 s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i=0; i <= 3; i++){
            System.out.println(s1.marks[i]);
        }
    }

    Student1(){
        System.out.println("Default cunst");
    }

    Student1(String name){
        this.name = name;
    }

    Student1(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name =  "John";
        s1.age=  20;
        s1.marks = new int[3];
        s1.marks[0] = 45;
        s1.marks[1] = 47;
        s1.marks[2] = 50;



        Student1 s2 = new Student1(s1);
        s2.marks[2] = 35; 

        for(int i=0; i <= 3; i++){
            System.out.println(s2.marks[i]);
        }
    }







}