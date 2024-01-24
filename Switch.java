import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the no : ");
        int num = sc.nextInt();

        switch(num){
            case 1 : System.out.println("Burgirr");
                        break ;
            case 2 : System.out.println("Momos");
                        break ;
            case 3 : System.out.println("Pizzzza");
                        break ;
            default: System.out.println("Wake up to reality ! ");
                        break ;

        }
        
    }

    
}
