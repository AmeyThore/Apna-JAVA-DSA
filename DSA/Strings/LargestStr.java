package DSA.Strings;

public class LargestStr {
    public static void main(String[] args) {
        String Fruit[] = {"mango","apple","banana" };
        String largest = Fruit[0];
        for (int i=1;i<Fruit.length;i++){
            if(largest.compareTo(largest)>0){//lexographical  order, so it will show error as compareto is not applicable for type string and int
                largest = Fruit[i];
            }
        }System.out.println(largest);
    }
}
