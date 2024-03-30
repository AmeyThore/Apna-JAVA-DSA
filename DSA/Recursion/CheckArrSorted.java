package DSA.Recursion;

public class CheckArrSorted {
    public static boolean  isArraySorted(int[] arr, int i) {
        
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return  isArraySorted(arr, i +  1);
    }
    public static void main(String[] args) {
        int arr[]={6,8,1,5};
        System.out.println(isArraySorted(arr,0));
    }
}
