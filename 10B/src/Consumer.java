public class Consumer implements Runnable {
    private BoundedBuffer buffer;

    // Constructor to pass the shared buffer
    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();

                // Simulate consumption time
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer interrupted.");
        }
    }
}

