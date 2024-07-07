package DSA.Stack;

import java.util.Stack;

public class reverseStack{
    public static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
            }
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        printStack(s);

    }
}