package DSA.ArrayList;

import java.util.ArrayList;

public class OptPairSum {
    public static boolean sum(ArrayList<Integer> list, int target){

        //2 pointer approch
        int rp= 0;
        int lp= list.size()-1;

        while(lp != rp){
            if(list.get(rp) + list.get(lp)== target){
                return true;
            }
            if(list.get(rp) + list.get(lp) > target){
                lp--;
            }else{
                rp++;
            }
        }
        return false;
    
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        int target = 5;
        System.out.println(sum(list, target));
    }
}
