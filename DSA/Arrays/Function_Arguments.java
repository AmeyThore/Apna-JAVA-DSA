package DSA.Array;

public class Function_Arguments {

    public static void update(int marks[]){

        for(int i= 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        
        }
    }

    public static void main(String[] args) {
        int marks[] = {60, 59, 54};

        update(marks);

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

    }
    
}
