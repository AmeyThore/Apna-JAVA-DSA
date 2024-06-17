package DSA.ArrayList;
import java.util.ArrayList;

public class SwapTwoNum {
    public static void swapper(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList  <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int idx1 = 1; int idx2 = 3;
        System.out.println(list);
        swapper(list, idx1, idx2);
        System.out.println(list);
    }
}
