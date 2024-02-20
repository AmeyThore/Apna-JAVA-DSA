package DSA.Strings;

public class Equals {
    public static void equals(String s1, String s2, String s3) {
        // if(s1 == s2){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }

        if(s1.equals(s2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(s1.equals(s3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        //equals function  checks the value of string not reference
        //== operator checks the reference of object
    }
    public static void main(String[] args) {
        String s1 = "Amey";
        String s2 = "Amey";
        String s3 = new String("Amey");
        equals(s1, s2, s3);
    }
}
