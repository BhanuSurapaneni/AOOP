import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private final int MAX_CAPACITY = 10;  // Buffer capacity
    private Queue<Integer> buffer = new LinkedList<>();  // Queue for storing items

    // Synchronized method for adding items to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        // Wait if the buffer is full
        while (buffer.size() == MAX_CAPACITY) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }

        // Add the item to the buffer
        buffer.add(item);
        System.out.println("Produced: " + item);

        // Notify the consumer that an item is available
        notifyAll();
    }

    // Synchronized method for consuming items from the buffer
    public synchronized int consume() throws InterruptedException {
        // Wait if the buffer is empty
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }

        // Remove an item from the buffer
        int item = buffer.poll();
        System.out.println("Consumed: " + item);

        // Notify the producer that space is available
        notifyAll();
        
        return item;
    }
}
