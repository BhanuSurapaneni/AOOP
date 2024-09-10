package Generic;

public class Main {
 public static void main(String[] args) {
     // Testing ArrayStack with Integer
     StackInterface<Integer> arrayStack = new ArrayStack<>();
     arrayStack.push(1);
     arrayStack.push(2);
     arrayStack.push(3);
     System.out.println("ArrayStack Peek: " + arrayStack.peek()); // 3
     System.out.println("ArrayStack Pop: " + arrayStack.pop());   // 3
     System.out.println("ArrayStack Is Empty: " + arrayStack.isEmpty()); // false

     // Testing LinkedListStack with String
     StackInterface<String> linkedListStack = new LinkedListStack<>();
     linkedListStack.push("A");
     linkedListStack.push("B");
     linkedListStack.push("C");
     System.out.println("LinkedListStack Peek: " + linkedListStack.peek()); // C
     System.out.println("LinkedListStack Pop: " + linkedListStack.pop());   // C
     System.out.println("LinkedListStack Is Empty: " + linkedListStack.isEmpty()); // false

     // Testing ArrayStack with Float
     StackInterface<Float> floatStack = new ArrayStack<>();
     floatStack.push(1.1f);
     floatStack.push(2.2f);
     System.out.println("Float Stack Peek: " + floatStack.peek()); // 2.2
     System.out.println("Float Stack Pop: " + floatStack.pop());   // 2.2
     System.out.println("Float Stack Is Empty: " + floatStack.isEmpty()); // false
 }
}
