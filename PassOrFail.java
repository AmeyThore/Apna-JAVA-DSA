import java.util.*;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Marks : ");
        int marks = sc.nextInt();

        String Status = (marks >= 12 ) ? "Pass" : "Fail";
        System.out.println(Status);
    }
}
