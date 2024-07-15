package DSA.Queues;
import java.util.*;

public class TwoStackQueue {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }

        //add
        public static void add(int data){//O(n)
            //check
            while(!s1.isEmpty()){//O(n1)
                s2.push(s1.pop());
            }
            
            //s1 is mt
            s1.push(data);
            
            //s2 is mt
            while(!s2.isEmpty()){//O(n2)
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove(){//O(1)
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop(); //bcoz at the top the is that pushed first
        }

        //peek
        public static int peek(){//O(1)
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
