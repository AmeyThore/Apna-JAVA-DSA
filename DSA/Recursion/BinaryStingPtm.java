package DSA.Recursion;

public class BinaryStingPtm {
    public static void StringPblm(int n, int lastdigit, String str){
        //there should not any consicutive 1s(1,1)
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        
        StringPblm(n-1,0, str+"0");// appending '0' to the stringbuilder and calling recursively with "0"
        if(lastdigit == 0){
            StringPblm(n-1 , 1, str+"1");
        }


    }
    public static void main(String[] args) {
        StringPblm(3 , 0, "");
    }
}
