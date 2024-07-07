package DSA.Stack;

import java.util.Stack;

public class reverseTheString {
    public static String reveString(String str){
        Stack<Character> s = new Stack<>();

        int idx = 0;//to iterate over the string
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
                     //or

        // String rev = "";//to store the reversed string
        // while(!s.isEmpty()){
        //     rev += s.pop();
        //     }
        //     return rev;
        
                     //or

        StringBuilder result = new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();

    } 
    public static void main(String[] args) {
        String str = "abc";
        String result = reveString(str);
        System.out.println(result);
    }
   
}
