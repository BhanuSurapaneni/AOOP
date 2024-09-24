import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<String> messageQueue;

    // Constructor to inject the shared buffer (queue)
    public Consumer(BlockingQueue<String> messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = messageQueue.take();  // Take message from queue (blocking if empty)
                
                if (message.equals("DONE")) {
                    System.out.println("No more messages. Consumer is terminating.");
                    break;
                }
                
                System.out.println("Consumed: " + message);
                
                Thread.sleep(150);  // Simulate time taken to consume messages
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer was interrupted.");
        }
    }
}
