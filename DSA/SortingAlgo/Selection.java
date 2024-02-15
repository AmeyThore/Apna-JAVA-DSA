package DSA.SortingAlgo;

public class Selection {

    public static void selection(int arr[]){

        for(int i = 0; i< arr.length; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }

            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,5,4};
        
        selection(arr);
        printArray(arr);
    }
    
}
