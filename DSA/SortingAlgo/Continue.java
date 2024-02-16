package DSA.SortingAlgo;

import java.util.Arrays;

public class Continue{
    public static void cont(int arr[]){
        int largest =  Integer.MIN_VALUE; // Initialize the variable with minimum possible integer value
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(arr[i],largest); // Update the largest number if the current number is greater than the largest
            
        }

        int count[]  = new int[largest+1];
        for(int i = 0; i<arr.length; i++){

            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    } 

    public static void main(String[] args){
        int arr[] = {0,3,4,4,5,8,1,3,4,2,7,2} ;   //Given array
        cont(arr);                               //Calling function to sort it using counting sort algorithm
        System.out.println(Arrays.toString(arr));
    }
}