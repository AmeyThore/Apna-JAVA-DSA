package DSA.Stack;

import java.util.Stack;

public class isDuplicate {
    public static boolean isDuplicate(String str1) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            // Closing parenthesis
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count == 0) {
                    return true; // Duplicate found
                } else {
                    s.pop(); // Pop the opening parenthesis
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "(((a+b)))"; // should return true
        String str2 = "(a+b+c)"; // should return false
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
