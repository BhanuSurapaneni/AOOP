public class BankAccountTest {
    public static void main(String[] args) {
        // Shared bank account with initial balance
        BankAccount account = new BankAccount(1000);

        // Create and start multiple threads to simulate concurrent access
        Thread user1 = new Thread(new TransactionTask(account), "User1");
        Thread user2 = new Thread(new TransactionTask(account), "User2");
        Thread user3 = new Thread(new TransactionTask(account), "User3");

        user1.start();
        user2.start();
        user3.start();
    }
}

// Task class that defines the transaction operations for each thread
class TransactionTask implements Runnable {
    private BankAccount account;

    public TransactionTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        // Perform some transactions
        for (int i = 0; i < 3; i++) {
            // Simulate deposit and withdrawal by users
            account.deposit(200);
            account.withdraw(150);

            try {
                // Sleep to simulate time taken for other operations
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
