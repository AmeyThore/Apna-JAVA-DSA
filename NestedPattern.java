public class NestedPattern {
    public static void main(String[] args) {

        //pattern

        // for(int lines = 1 ; lines <= 4; lines++){
        //     for(int star =1; star <= lines; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //reverse pattern
            // int n = 4;
            // for(int line = 1; line <= 4; line++){
            //     for(int star = 1; star<= n-line+1; star++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

        //numper pyramid

        //    for(int line = 1; line <= 4; line++){
        //     for(int num = 1; num <= line; num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        //    }

        //ABC char pyramid

        char ch = 'A';

        for(int line = 1; line <= 4; line++){
            for(int cha = 1 ; cha <= line; cha++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }


}
