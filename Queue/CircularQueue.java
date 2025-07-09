package Queue;

public class CircularQueue {
    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;
        static int front = -1;

        Queue(int size){
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static void Add(int d){
            if(isFull()) {
                System.out.println("Queue Full");
                return;
            }
            if(isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = d;
        }

        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int res = arr[front];
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.Add(5);
        System.out.println("Removed :- " + q.remove());
        q.Add(6);
        System.out.println("Removed :- " + q.remove());
        q.Add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
