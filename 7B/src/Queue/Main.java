package Queue;
//Main.java
import java.util.Comparator;

public class Main {
 public static void main(String[] args) {
     // Testing PriorityQueue with Integer
     PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
     intQueue.add(5);
     intQueue.add(1);
     intQueue.add(3);
     System.out.println("Integer Priority Queue Peek: " + intQueue.peek()); // 1
     System.out.println("Integer Priority Queue Remove: " + intQueue.remove()); // 1
     System.out.println("Integer Priority Queue Peek after Remove: " + intQueue.peek()); // 3

     // Testing PriorityQueue with Double
     PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
     doubleQueue.add(2.2);
     doubleQueue.add(1.1);
     doubleQueue.add(3.3);
     System.out.println("Double Priority Queue Peek: " + doubleQueue.peek()); // 1.1
     System.out.println("Double Priority Queue Remove: " + doubleQueue.remove()); // 1.1
     System.out.println("Double Priority Queue Peek after Remove: " + doubleQueue.peek()); // 2.2

     // Testing PriorityQueue with String
     PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
     stringQueue.add("banana");
     stringQueue.add("apple");
     stringQueue.add("cherry");
     System.out.println("String Priority Queue Peek: " + stringQueue.peek()); // apple
     System.out.println("String Priority Queue Remove: " + stringQueue.remove()); // apple
     System.out.println("String Priority Queue Peek after Remove: " + stringQueue.peek()); // banana
 }
}
