package DSA.ArrayList;

import java.util.ArrayList;

public class Funcyionds {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //add fuction
        //1
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //2
        list.add(1,9);
        System.out.println(list);

        //get funtion

        int element = list.get(3);
        System.out.println(element);

        //remove funtion

        list.remove(3);
        System.out.println(list);

        //set element

        list.set(3,4);
        System.out.println(list);

        //contain funtion 

        System.out.println(list.contains(3));
        System.out.println(list.contains(5));



    }
}
