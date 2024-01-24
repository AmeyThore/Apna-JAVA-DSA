import java.util.*;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the value of A : ");
        int A = sc.nextInt();

        System.out.println("Write the value of B : ");
        int B = sc.nextInt();

        System.out.println("Write the value of C : ");
        int C = sc.nextInt();

    if ((A >= B) && (A >= C)){
        System.out.println("A is the largest");
        }

        else if((B>=C)) {
            System.out.println("B is the largest");
        } 
        else {
            System.out.println("C is the largest");
        }

    }

}
