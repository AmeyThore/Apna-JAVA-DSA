package DSA.Queues;

public class QueueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            //if empty
            if(head == null){
                head = tail = newNode;
                return;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int remove(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }
             
            int front = head.data;
            //when single ele in  LL 
            if(tail == head){
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if(head == null){
                System.out.println("ll is mt");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}


