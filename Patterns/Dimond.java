package Patterns;

public class Dimond {
    public static void dimond(int n){
        //outer
        for(int i =1; i <= n; i++){
            //inner
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                //if(i % 2 != 0){
                    System.out.print("*");
                
            }
            System.out.println();
        }
        for(int i =n; i >= 1; i--){
            //inner
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                //if(i % 2 != 0){
                    System.out.print("*");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        dimond(5);
    }
}
