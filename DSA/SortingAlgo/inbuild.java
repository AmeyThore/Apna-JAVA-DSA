package DSA.SortingAlgo;
import java.util.Arrays;

public class inbuild{
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,1};

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        printArr(arr);
    }
}