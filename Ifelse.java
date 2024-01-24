import java.util.*;

public class Ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = sc.nextInt() ;
        

        if (age>=18){
            System.out.println("able to vote");

            }
            if (age > 13 && age < 18){
                System.out.println("tenager");
            }
                else{
                    System.out.println("unable to vote");
        }

    }

}