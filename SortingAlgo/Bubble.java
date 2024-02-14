package DSA.SortingAlgo;

public class Bubble {

    public static void bubbleSort(int arr[]){

        for(int turn = 0; turn < arr.length-1; turn++){
            // Last i elements are already in place
            for(int j = 0; j < arr.length-2-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 5, 2};
        bubbleSort(arr);
        System.out.println("The sorted array is: ");
        printArray(arr);
    }
    
}
