package DSA.Array;

public class KadansMaxSubarraySum {

    public static void kadans(int numbers[]){
        int cs = 0;
        int ms = 0;

        for(int i=0; i < numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("The maximum sub array sum is: " + ms);

        
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadans(numbers);
         
    }
}
