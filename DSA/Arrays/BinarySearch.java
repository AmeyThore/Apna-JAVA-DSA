package DSA.Array;

public class BinarySearch {

    public static int BinarySearch(int numbers[], int key){
        // set two pointers to the start and end of array
        int start = 0;
        int end  = numbers.length - 1;

        for(int i = 0; i <= numbers.length; i++){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 8;

        System.out.println("The index of the key number is : " + BinarySearch(numbers, key));
    }
}
