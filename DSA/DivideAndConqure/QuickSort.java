package DSA.DivideAndConquer;

import DSA.Recursion.printDecrising;

public class QuickSort {
    public static void PrintArr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        
    }
    public static void quicksort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pidx = partion(arr, si, ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, ei);
    }
    public static int partion(int arr[], int si, int ei){
        int pivot = arr[ei];  // rightmost element is the pivot
        int i = si - 1;

        for(int j = si; j <= ei; j++ ){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
                //swap
                int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;

                return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
