package aoop5b3;


public class LSPDemo {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        // Demonstrating LSP with Sparrow
        sparrow.fly(); // Works fine

        // Demonstrating LSP violation with Ostrich
        try {
            ostrich.fly(); // Causes an exception
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
