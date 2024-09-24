public class BoundedBufferApp {
    public static void main(String[] args) {
        // Create a shared bounded buffer
        BoundedBuffer buffer = new BoundedBuffer();

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer), "ProducerThread");
        Thread consumerThread = new Thread(new Consumer(buffer), "ConsumerThread");

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
