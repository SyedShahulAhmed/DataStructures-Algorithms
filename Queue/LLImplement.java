package Queue;

public class LLImplement {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;

        public static boolean isEmpty() {
            return (head == null && tail == null);
        }

        public static void Enqueue(int d) {
            Node newNode = new Node(d);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int Dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int f = head.data;
            head = head.next;
            if (head == null) tail = null; // Reset tail when queue becomes empty
            return f;
        }

        public static int Peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(7);
        q.Enqueue(8);
        System.out.println("Removed :-" + q.Dequeue());
        System.out.println("Removed :-" + q.Dequeue());
        System.out.println("Removed :-" + q.Dequeue());
        System.out.println("Queue Elements are :- ");
         while (!q.isEmpty()) {
            System.out.println("                    " + q.Peek());
            q.Dequeue();
        }
    }
}
