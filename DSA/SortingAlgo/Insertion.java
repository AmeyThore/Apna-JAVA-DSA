package DSA.SortingAlgo;

public class Insertion {

    public static void insertion(int arr[]){
        for(int i = 1; i <arr.length;i++){
        int curr = arr[i];
        int previous = i-1;
        
        while (previous >= 0 && arr[previous] > curr) {
            // swap the elements if current element is smaller than its adjacent one
            arr[previous + 1] = arr[previous];
            previous--;
        }

        arr[previous + 1] = curr;
        }
    }    



public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}

public static void main(String[] args) {
    int arr[] = {5, 2, 1, 4, 3};
    insertion(arr);
    printArray(arr);
}
}
