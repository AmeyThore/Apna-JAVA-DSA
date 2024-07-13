package DSA.Stack;

import java.util.Stack;

public class MaxAreaHist {
    public static void MaxArea(int arr[]){
        int mxArea = 0;
        int nsr[] = new int[arr.length];//next smaller right
        int nsl[] = new int[arr.length];//next smaller left

        //next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i >= 0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        
        //next smaller left
        s = new Stack<>();//empty stack

        for(int i = 0; i < arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Max Area
        for(int  i = 0 ; i< arr.length; i++){
            int hight = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = hight * width;
            mxArea = Math.max( mxArea , currArea);
        }

        System.out.println("Maximum area of histogram : "+mxArea);

    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        MaxArea(arr);

    }
}
