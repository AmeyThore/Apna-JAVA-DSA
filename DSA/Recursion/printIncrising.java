package DSA.Recursion;

public class printIncrising {
    public static void PrintIncresing(int n){
        if (n == 1) {//Base case
            System.out.print(n + " ");
            return ;
        }
        PrintIncresing(n-1);
        System.out.print(n + " ");
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Print numbers in increasing order:");
        PrintIncresing(n);
    }
}
