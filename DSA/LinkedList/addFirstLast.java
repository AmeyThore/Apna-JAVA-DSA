package DSA.LinkedList;

public class addFirstLast{
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
    public void addFirst(int data){
        //1.create new node
        Node newNode = new Node(data);
        //2. check null 
        if(head == null){
            head = tail = newNode;
            return;
        }
        //3.assign next to head
        newNode.next = head;
        //4.assign head to new node
        head = newNode;
    }
    public void addLast(int data){
        Node newNode1 = new Node(data);
        if(head == null){
            head = tail = newNode1;
            return;
        }
        tail.next = newNode1;
        tail = newNode1;
        
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addFirstLast ll = new addFirstLast();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();


        //1(head)->2->3->4(tail)
        
    }
}