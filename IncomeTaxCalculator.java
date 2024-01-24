import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the Salary :");
        int a = sc.nextInt();
        int tax;

        if(a <= 500000){
            tax = 0;
        }
        else if (a >= 500000 && a <= 100000){
            tax = (int) (a * 0.2);
        } else {
            tax = (int) (a * 0.3);
        }
        

        System.out.println("your tax is : " + tax);
        int total = a - tax;
        System.out.println("Total Income : " + total);
    }
}