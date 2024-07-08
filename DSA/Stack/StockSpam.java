package DSA.Stack;

import java.util.Stack;

public class StockSpam {
    public static void StockSpam(int[] Stocks,int[] span){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1; i < Stocks.length; i++){
            int currPrize = Stocks[i];
            while(!s.isEmpty() && currPrize > Stocks[s.peek()]){
                s.pop();
            }   
            if(s.isEmpty()){
                span[i] = i + 1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
        
    }
    public static void main(String[] args) {
        int[] Stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[Stocks.length];
        StockSpam(Stocks, span);

        for(int i =0;  i<span.length; i++){
            System.out.println(span[i]+ " ");
        }
    }
}
