package DSA.Queues;

import java.util.*;


public class reverseQueue {
    public static void ReverseQ(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        //add ele to stack from q
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        //and pop it one by one from the stack
        while(!s.isEmpty()){
            q.add(s.pop());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        ReverseQ(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
