package OOPS;

public class Student {
    String name;
    int age;
    String password;
    int marks[];

    Student() {
        System.out.println("Default constructor called");
    }

    Student(Student p1) {
        marks = new int[3];
        this.name = p1.name;
        this.age = p1.age;
        this.marks = p1.marks;
          }

    Student(int age) {
        this.age = age;
    }

    Student(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Student p1 = new Student("Nimisha"); // passing the name as an argument
        p1.age = 18;
        p1.password = "asc";

        p1.marks = new int[3]; // initialize the marks array
        p1.marks[0] = 89;
        p1.marks[1] = 84;
        p1.marks[2] = 87;

        Student p2 = new Student(p1);
        p2.password = "Amey";
        p2.marks[1] = 100;

        for (int i = 0; i < 3; i++) { // corrected loop condition
            // System.out.println(p1.marks[i]);
            // System.out.println("p2=");
            System.out.println(p2.marks[i]);
        }
    }
}
