package DSA.Backtracking;

public class Subset {
    public static void FindSubset(String str, String ans, int i){
        //base case
        if(i == str.length()){

            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
            
        }
        //yes Choice
        FindSubset(str, ans+str.charAt(i), i+1);
        //No choice
        FindSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        FindSubset(str," ", 0);
    }
}
