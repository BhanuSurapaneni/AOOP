package aoop5b2;

public class OCPDemo {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        // Calculate and display areas
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}

