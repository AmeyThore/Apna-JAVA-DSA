package DSA.LinkedList;

public class RemoveNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;

        }
        newNode.next =head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addMid(int idx, int data){
        if ( idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void Remove(int n){
        //first find size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        //remove head
        if(n == size){
            head = head.next;
        }

        //core
        int i = 1;
        int iTOfind = size-n;
        Node prev = head;
        if(i < iTOfind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMid(3, 9);
        ll.print();
        ll.Remove(3);
        ll.print();
    }
}
