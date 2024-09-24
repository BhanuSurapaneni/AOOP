public class NumberPrinter {
    private static final Object lock = new Object();
    private static int currentNumber = 1;

    public static void main(String[] args) {
        Thread t2 = new Thread(new PrintTwo());
        Thread t3 = new Thread(new PrintThree());
        Thread t4 = new Thread(new PrintFour());
        Thread t5 = new Thread(new PrintFive());
        Thread tNum = new Thread(new PrintNumber());

        t2.start();
        t3.start();
        t4.start();
        t5.start();
        tNum.start();
    }

    static class PrintTwo implements Runnable {
        public void run() {
            while (currentNumber <= 15) {
                synchronized (lock) {
                    if (currentNumber % 2 == 0) {
                        System.out.println("Divisible by 2: " + currentNumber);
                        currentNumber++;
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    static class PrintThree implements Runnable {
        public void run() {
            while (currentNumber <= 15) {
                synchronized (lock) {
                    if (currentNumber % 3 == 0) {
                        System.out.println("Divisible by 3: " + currentNumber);
                        currentNumber++;
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    static class PrintFour implements Runnable {
        public void run() {
            while (currentNumber <= 15) {
                synchronized (lock) {
                    if (currentNumber % 4 == 0) {
                        System.out.println("Divisible by 4: " + currentNumber);
                        currentNumber++;
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    static class PrintFive implements Runnable {
        public void run() {
            while (currentNumber <= 15) {
                synchronized (lock) {
                    if (currentNumber % 5 == 0) {
                        System.out.println("Divisible by 5: " + currentNumber);
                        currentNumber++;
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    static class PrintNumber implements Runnable {
        public void run() {
            while (currentNumber <= 15) {
                synchronized (lock) {
                    if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                        System.out.println("Number: " + currentNumber);
                        currentNumber++;
                    }
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}
