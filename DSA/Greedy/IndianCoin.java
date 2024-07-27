package DSA.Greedy;
import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1, 5, 10, 20, 50, 100, 200, 500};

        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i++){
            while(amount >= coins[i]){
                count++;
                ans.add(coins[i]);
                amount = amount - coins[i];
            }
        }
        System.out.println("Total no. of coins used : "+count);

        for(int i = 0; i < ans.size(); i++ ){
            System.out.println("Coins used : "+ans.get(i));
        }
        System.out.println();
    }
}
