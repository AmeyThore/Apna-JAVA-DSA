import java.util.*;

public class SumOfFirstNno {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i<= n){

            sum += i ; // sum = sum + i;
            i++;


        }
        System.out.println("The sum is "+sum);
    }
}
