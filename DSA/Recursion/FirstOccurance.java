package DSA.Recursion;

public class FirstOccurance {
    public static  int firstOccurance(int arr[], int key, int i) {
        if(arr[i] == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurance(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,5};
        System.out.println(firstOccurance(arr, 5, 0));

    }    
}
