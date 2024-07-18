package DSA.Queues;
import java.util.*;

public class StackDequeue {
    static class stack{
        Deque<Integer> d = new LinkedList<>();

        public void push(int data){
            d.addLast(data);
        }

        public int pop(){
            return d.removeLast();
        }

        public int peek(){
            return d.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
    }
}
