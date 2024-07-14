package DSA.Queues;
import java.util.*;

public class JCF {
    public static void main(String[] args) {//Queue is an interface that can only be implimented be these
        //Queue<Integer> q = new LinkedList<>();//linkedlist
        Queue<Integer> q = new ArrayDeque<>();//ArrayDequeue
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
