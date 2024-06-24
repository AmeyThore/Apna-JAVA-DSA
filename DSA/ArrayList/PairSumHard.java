package DSA.ArrayList;

import java.util.ArrayList;

public class PairSumHard {
    
        public static boolean sum(ArrayList<Integer> list, int target){
            // two pointer approach
            int n = list.size();
            int bp = -1; // breaking point assign to invisible value
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i) > list.get(i + 1)){
                    bp = i;
                    break;
                }
            }
    
            int rp = bp; // right point
            int lp = (bp + 1)%n; // left point
    
            while(lp != rp){
                // case 1
                if(list.get(rp) + list.get(lp) == target){
                    return true;
                }
                if(list.get(rp) + list.get(lp) < target){
                    lp = (lp + 1) % n;
                } else {
                    rp = (n + rp - 1) % n;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        ArrayList <Integer> list =  new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(sum(list, target));
    }
}
