package OOPS;

public class RunTimePolymorphims {
    void animal(){
        System.out.println("Hello deer");
    }

    static class  Dog extends RunTimePolymorphims{
        @Override
        void animal() {
            System.out.println("Hello dog");
        }

    }

    public static void main(String[] args) {
        Dog Husky = new RunTimePolymorphims.Dog();
        Husky.animal();
    }
}
