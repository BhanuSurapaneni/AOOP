public class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized method to deposit an amount
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Current Balance: " + getBalance());
        }
    }

    // Synchronized method to withdraw an amount
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Current Balance: " + getBalance());
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw: " + amount + " but insufficient balance.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
