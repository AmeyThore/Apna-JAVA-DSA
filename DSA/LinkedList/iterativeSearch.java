package DSA.LinkedList;

public class iterativeSearch {
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
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;

        }
        newNode.next =head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
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
    public static int iterativeSearch(int key){
        int i = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){

                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not fount
        return -1;
    }
    public static void main(String[] args) {
        iterativeSearch ll = new iterativeSearch();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMid(3, 9);
        ll.print();
        
        System.out.println(iterativeSearch(10));
        System.out.println(iterativeSearch(3));
    }
}
