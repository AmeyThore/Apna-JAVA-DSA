package DSA.Greedy;
import java.util.*;


public class MaxlengthChainPair {
    public static void main(String[] args) {//O(logn)
        int Pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(Pairs,Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int ChainEnd = Pairs[0][1];

        for(int i = 0 ; i < Pairs.length; i++){
            if(Pairs[i][0] > ChainEnd){
                chainLen++;
                ChainEnd = Pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain "+chainLen);
    }
}
