package OOPS;

interface InterfaceChess {
    void moves();

    static class Queen implements InterfaceChess{
        public void moves(){
            System.out.println("up,down,left,right, digonal");
        }
    }
    static class King implements InterfaceChess{
        public void moves(){
            System.out.println("up,down,left,right, digonal");
        }
    }
    static class Pawn implements InterfaceChess{
        public void moves(){
            System.out.println("up,digonal");
        }
    }
    static class Rookh implements InterfaceChess{
        public void moves(){
            System.out.println("up,down,left,right");
        }
    }

    public static void main(String[] args) {
        InterfaceChess q = new Queen();
        q.moves();
    }
}
