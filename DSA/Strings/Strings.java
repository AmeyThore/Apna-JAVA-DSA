package DSA.Strings;
import java.util.*;

public class Strings {
    public static void spaces(String Name){
        for(int i =0 ; i<Name.length(); i++){
            System.out.print(Name.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = new String("Godzz");
        // System.out.println("Character array to string: "+str);

        // //Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        //Concatination

        String FirstName = "Amey";
        String LastName = "Thore";
        String Name2 = FirstName + " " + LastName;
        String Name = "Achive Gods Complex";
        System.out.println(Name);
        System.out.println(Name.length());

        spaces(Name);
    }
}
