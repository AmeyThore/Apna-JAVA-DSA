package DSA.LinkedList;

public class DoublyLL {
    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        size++;
        head = newNode;
        head.prev = null;
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value  = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
        
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addFirst(40);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
    }

}
