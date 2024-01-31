package Patterns;

public class Butterfly {

    public static void butterfly(int n){

        //outer
        for(int i =1 ; i <= n; i++){

            //inner
            for(int j =1; j<= i; j++){
                System.out.print("*");
            }
            for(int j =1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();


        }
        
        for(int i = n; i >= 1; i--){
            //inner
            for(int j =1; j<= i; j++){
                System.out.print("*");
            }
            for(int j =1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main (String[] args) {
        butterfly(5);
    
}
}
