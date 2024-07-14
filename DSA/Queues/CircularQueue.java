package DSA.Queues;

public class CircularQueue{
    static class Queue{
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty(){//O(1)
            return front == -1 && rear == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static void add(int data){//O(1)
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){//O(1)
            if(isEmpty()){
                System.out.println("Q is mt");
                return -1;
            }
            int result = arr[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front + 1) % size;
                }
            return result;
        }

        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Q is mt");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}