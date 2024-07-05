package DSA.LinkedList;


public class MergeSort {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public Node head;
    public Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;

        }
        newNode.next =head;
        head = newNode;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    private Node merge(Node head1 , Node head2){
        Node  mergerdLL = new Node(-1);
        Node temp = mergerdLL;// to traverse on mergerdLL

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        Node merger = mergerdLL.next;
        return merger;
    }

    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //next
        Node rightHead = mid.next;
        mid.next = null;
        //left
        Node leftHead = head;

        //merge
        Node left = mergeSort(leftHead);
        Node right = mergeSort(rightHead);

        //merge them
        Node sorted = merge(left, right);

        //return
        return sorted;
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
        MergeSort ll = new MergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(6);
        ll.addFirst(9);
        ll.addFirst(4);

        ll.print();
        ll.head = ll.mergeSort(ll.head);

        ll.print();
        
    }   
}
