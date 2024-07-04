package DSA.LinkedList;

import DSA.Backtracking.nQueens;

public class RemoveLLcycle {
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

    public static boolean isCycleExist(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    } 

    public static void removeCycle(){
        //find cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        //next
        if(cycle == false){
            return;
        } 
        //else
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //Now 
        prev.next = null;

    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next  = temp;
        head.next.next = new Node(3);
        head.next.next.next  = temp;
        //1->temp(2)->3->temp(2)
        System.out.println(isCycleExist(head));
        removeCycle();
        System.out.println(isCycleExist(head));
        
    }
}
