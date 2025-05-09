package Queue;

public class ArrayImplement {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
    public static boolean isEmpty(){
        return rear == -1;
    }
    public static boolean isFull(){
        return rear == size-1;
    }
    public static void Enqueue(int data){
        if(isFull()){
            System.out.println("Queue Full");
            return;
        }
        arr[++rear] = data;
    }
    public static int Dequeue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return -1;
        }
        int front = arr[0];
        for(int i = 0; i < rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }
    public static void printq(){
        for(int i = 0; i <= rear; i++){
            System.out.println(arr[i]);
        }
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[0];
    }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Dequeue();
        q.printq();
        
    }
}
