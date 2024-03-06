package OOPS;
 
public class MultiLevelInheritance{
    String name;

    void name(){
        System.out.println("namya");
    }


static class Mammal extends MultiLevelInheritance{
    String Shape;
    int legs;

    void Shape(){
        System.out.println("4 legs");
    }
    void leg(){
        System.out.println(4);
    }
}
static class  Dog extends Mammal{
    int  tail;

    void tail(){
        System.out.println(1);
    }
}
public static void main(String[] args) {
    Dog Husky = new Mammal.Dog();
    Husky.name();
    Husky.Shape();
}
}
