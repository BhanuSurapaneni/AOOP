import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessagingApp {
    public static void main(String[] args) {
        // Create a shared buffer (queue) with capacity for 5 messages
        BlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(5);

        // Create producer and consumer objects
        Producer producer = new Producer(messageQueue);
        Consumer consumer = new Consumer(messageQueue);

        // Create and start the producer and consumer threads
        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");

        producerThread.start();
        consumerThread.start();

        try {
            // Wait for the threads to finish
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Messaging application has terminated.");
    }
}
