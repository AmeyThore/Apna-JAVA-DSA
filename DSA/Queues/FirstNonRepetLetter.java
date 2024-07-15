package DSA.Queues;
import java.util.*;

public class FirstNonRepetLetter {
    public static void nonRepetingletter(String str){
        //1.Array
        int freq[] = new int[26];

        //Queue
        Queue<Character> q = new LinkedList<>();

        //implimentation
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //add charcters into q
            q.add(ch);
            //add freq of char into freq arr
            freq[ch - 'a']++;
            
            //remove from the q if freq is > 1
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            //ending statement
            if(q.isEmpty()){
                System.out.println(-1 +" ");
            }else{
                System.out.println(q.peek() +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        nonRepetingletter(str);
    }
}
