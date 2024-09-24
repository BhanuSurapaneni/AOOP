import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<String> messageQueue;

    // Constructor to inject the shared buffer (queue)
    public Producer(BlockingQueue<String> messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String message = "Message-" + i;
                messageQueue.put(message);  // Add message to the queue (blocking if full)
                System.out.println("Produced: " + message);
                
                Thread.sleep(100);  // Simulate time taken to produce messages
            }

            // Once done producing, we add a termination message
            messageQueue.put("DONE");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer was interrupted.");
        }
    }
}
