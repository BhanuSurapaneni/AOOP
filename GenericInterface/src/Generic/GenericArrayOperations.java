package Generic;

public class GenericArrayOperations<T extends Comparable<T>> implements ComparableInterface<T> {

	@Override
	public T getMax(T[] array) {
		  T max = array[0];
	        for (T element : array) {
	            if (element.compareTo(max) > 0) {
	                max = element;
	            }
	        }
	        return max;
	}

	@Override
	public T getMin(T[] array) {
		 T min = array[0];
	        for (T element : array) {
	            if (element.compareTo(min) < 0) {
	                min = element;
	            }
	        }
	        return min;
	}
}
