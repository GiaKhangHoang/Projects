public class Queue<T> {
    private T[] arr;
    private int rear;
    private int front;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
        arr = (T[]) new Object[capacity]; // Generic array creation
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T removedItem = arr[front];
        front = (front + 1) % capacity;
        size--;
        return removedItem;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);

        int firstItem = queue.peek();
        System.out.println(firstItem); // prints 1

        int removed = queue.dequeue();
        System.out.println(removed);   // prints 1
    }
}