package DSA.LinkedList;

public class CheckLLisPalindrom {
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

    public void addlast(int data){
        Node newNode = new Node(data);

        if(head == null){
            tail = head = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    //Slow-Fast approach
    public Node findMid(Node head){
        Node  slow = head;
        Node fast = head;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public boolean findPalindrom(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node mid = findMid(head);

        
        //reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;


        //check 1st half = 2nd half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
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
        CheckLLisPalindrom ll = new CheckLLisPalindrom();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        // ll.addlast(1);

        ll.print();
        System.out.println(ll.findPalindrom());
  
    }
}
