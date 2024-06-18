package DSA.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("Unsorted list : "+list);
        //Ascending
        Collections.sort(list);
        System.out.println("Ascending Sorted List : " + list);

        //Decending
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Decending sorted Array : "+list);
    }
}
