class Queue <V>{
    private int maxSize;
    private int currentSize;
    private V[] arr;
    private int front;
    private int back;
    Queue(int maxSize){
        this.maxSize = maxSize;
        currentSize = 0;
        front = 0;
        back = -1;
        arr = (V[]) new Object[maxSize];
    }
    public boolean isEmpty(){
        return currentSize == 0;
    }
    public boolean isFull(){
        return currentSize == maxSize;
    }
    public void enQueue(V value){
        if(isFull()) return;
        back = (back + 1) % maxSize;
        arr[back] = value;
        currentSize++;
    }
    public V deQueue() {
        if (isEmpty())
            return null;
        V temp = arr[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }
}

public class QueueImplementation {
        public static void  main(String[] args){
            Queue<Integer> queue = new Queue<>(5);
            queue.enQueue(1);
            queue.enQueue(2);
            queue.enQueue(3);
            queue.enQueue(4);
            queue.enQueue(5);
            // dequeue 2 elements from the start
            queue.deQueue();
            //queue.deQueue();
            //enqueue 12 and 14 at the end
            queue.enQueue(10);
            //queue.enQueue(20);

            System.out.println("Queue:");
            while(!queue.isEmpty()){
                System.out.print(queue.deQueue()+" ");
            }
        }
}
