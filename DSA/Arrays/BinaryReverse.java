package DSA.Array;

public class BinaryReverse {

    public static void reverse(int number[]){

        int first = 0;
        int last = number.length-1;

        while(first < last){
            
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }


    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};

        reverse(number);

        for(int i = 0; i <= number.length; i++){
            System.out.println(number[i]+" ");

        }System.out.println();
    }
    
}
