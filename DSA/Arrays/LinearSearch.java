package DSA.Array;

public class LinearSearch{

    public static int LS(int marks[], int key){
        for(int i = 0; i <= marks.length; i++){
            if(marks[i] == key){
                
                return i;
            }
            

        }
        return -1;
        

    }
    public static void main(String[] args) {
        int marks[] = {12,34,12,45,12,56,23,645,23,87};
        int key= 12;

        int index =  LS(marks, key);

        if(index == -1){
            System.out.println("index not found");
        }else{
            System.out.println("Element is present at index " + index);
        }

    }
}