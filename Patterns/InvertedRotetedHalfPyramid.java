package Patterns;

public class InvertedRotetedHalfPyramid {

    public static void Py(int n){

        for(int i =1; i <= n; i++){
            //outer
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //inner
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }

    public static void main(String[] args) {
        Py(4);
    }
    
}
