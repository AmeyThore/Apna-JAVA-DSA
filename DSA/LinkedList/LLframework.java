package DSA.LinkedList;
import java.util.LinkedList;// uses JCF(Java Collection Faramework)

public class LLframework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.add(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.add(5);
        //print
        System.out.println(ll);
        //remove
        ll.remove(2);//3
        ll.removeFirst();//2
        ll.removeLast();//5
        //print
        System.out.println(ll);
    }
}
