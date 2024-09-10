package Generic;

public class Main {

	public static void main(String[] args) {
		        // Integer Array
		        Integer[] intArray = {5, 3, 8, 1, 4};
		        GenericArrayOperations<Integer> intOps = new GenericArrayOperations<>();
		        System.out.println("Max Integer: " + intOps.getMax(intArray));
		        System.out.println("Min Integer: " + intOps.getMin(intArray));

		        // String Array
		        String[] strArray = {"apple", "banana", "kiwi", "pear"};
		        GenericArrayOperations<String> strOps = new GenericArrayOperations<>();
		        System.out.println("Max String: " + strOps.getMax(strArray));
		        System.out.println("Min String: " + strOps.getMin(strArray));

		        // Character Array
		        Character[] charArray = {'d', 'a', 'c', 'b'};
		        GenericArrayOperations<Character> charOps = new GenericArrayOperations<>();
		        System.out.println("Max Character: " + charOps.getMax(charArray));
		        System.out.println("Min Character: " + charOps.getMin(charArray));

		        // Float Array
		        Float[] floatArray = {5.5f, 3.3f, 8.8f, 1.1f};
		        GenericArrayOperations<Float> floatOps = new GenericArrayOperations<>();
		        System.out.println("Max Float: " + floatOps.getMax(floatArray));
		        System.out.println("Min Float: " + floatOps.getMin(floatArray));
		    }
		}

