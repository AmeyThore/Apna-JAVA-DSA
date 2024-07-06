package DSA.LinkedList;

public class ReversDLL {
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
        head = newNode;
        newNode.prev = null;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReversDLL ll = new ReversDLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
