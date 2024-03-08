package OOPS;
// polymorphism
//compile time polymorphism
public class CompileTimePolymorphism{

    int sum(int a, int b){
        return a + b;
    }
    float sum(float a , float b){
        return  a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        //compile time polymorphism
        CompileTimePolymorphism calc = new CompileTimePolymorphism();
        System.out.println(calc.sum(5 , 8));
        System.out.println(calc.sum((float)1.4,(float)2.6));
        System.out.println(calc.sum(5,2,2));
    }
}