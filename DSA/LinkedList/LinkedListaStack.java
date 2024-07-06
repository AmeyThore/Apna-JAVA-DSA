package DSA.Stack;

public class LinkedListaStack {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop(){
            if(isEmpty()){
                return -1;//noeting to return
            }
            int top = head.data;
            head =head.next;
            return top;
        }

        public static int peek(){
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
