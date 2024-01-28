package Patterns;

public class Square {

    public static void Square(int row, int coloum){
        //outer loop

        for(int i=1; i<=row;i++ ){
            //Inner loop
            for (int j = 1;j <=coloum ; j++){
                if(i == 1 || i == row || j == 1 || j ==coloum){
                System.out.print("*");
                }else{
                System.out.print(" ");
                }
            }
        System.out.println();
        
        }
    }
    public static void main(String[] args) {
        System.out.println(" ");
        Square(4,4);
        
    }
       
    
}
