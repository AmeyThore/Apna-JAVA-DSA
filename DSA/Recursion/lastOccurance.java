package DSA.Recursion;

public class lastOccurance {
    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound  = lastOccurance(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] ={10, 20, 30, 40, 50};
        System.out.println("Last Occurrence of 40 is at index : " +lastOccurance(arr, 40, 0));
    }
}
