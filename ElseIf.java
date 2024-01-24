public class ElseIf {
    public static void main(String[] args) {
        int a =10;

        if (a >= 18){
            System.out.println("adult");
        }
        else if (a >= 13 && a <= 18){
            System.out.println("teen");

        }else {
            System.out.println("child");
        }
    }
    
}
