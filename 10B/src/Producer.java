public class Producer implements Runnable {
    private BoundedBuffer buffer;

    // Constructor to pass the shared buffer
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            int item = 0;  // Initial item value

            while (true) {
                buffer.produce(item);
                item++;

                // Simulate production time
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer interrupted.");
        }
    }
}
