package aoop5b4;

public class ISPDemo {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Human human = new Human();

        // Demonstrating the Robot's functionality
        robot.work(); // Robot only works

        // Demonstrating the Human's functionality
        human.work(); // Human works
        human.eat();  // Human eats
    }
}
