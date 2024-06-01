package DSA.DivideAndConquer;

public class SortedAndRotetedArr {
    public static int Search(int arr[], int target , int si , int ei){
        if(si > ei){
            return -1;
        }
        int mid =  si + (ei - si)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            //Line 1
            if(arr[si] <= target &&  target <= arr[mid]){
                return Search(arr, target, si, mid-1);
            }else{
                return Search(arr, target, mid+1, ei);
            }
            
            //Line2
        }else{
            if(arr[mid+1] <= target && target <= arr[ei] ){
                return Search(arr, target, mid+1, ei);
            }else{
                return Search(arr, target, si, mid-1);
            }
        }


    }
    public static void main(String[] args) {
        int arr[ ] = {4,5,6,7,0,1,2};
        int target = 0;
        int tIDX = Search(arr , target , 0 , arr.length-1);
        System.out.println(tIDX);

    }   
}
