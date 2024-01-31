package Patterns;
// package Patterns;

public class FloydsTriangle {

    public static void Triangle(int n){
        int counter = 1;

        for(int i =1; i <= n; i++){
            
            

            for(int j =1 ; j <= i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        Triangle(5);

    
}
}
