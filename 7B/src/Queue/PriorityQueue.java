package Queue;

import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<T> {
 private ArrayList<T> elements;
 private Comparator<? super T> comparator;

 public PriorityQueue(Comparator<? super T> comparator) {
     this.elements = new ArrayList<>();
     this.comparator = comparator;
 }

 public void add(T item) {
     elements.add(item);
     siftUp(elements.size() - 1);
 }

 public T remove() {
     if (isEmpty()) {
         throw new IllegalStateException("Priority Queue is empty");
     }
     T result = elements.get(0);
     T lastItem = elements.remove(elements.size() - 1);
     if (!isEmpty()) {
         elements.set(0, lastItem);
         siftDown(0);
     }
     return result;
 }

 public T peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Priority Queue is empty");
     }
     return elements.get(0);
 }

 public boolean isEmpty() {
     return elements.isEmpty();
 }

 private void siftUp(int index) {
     T item = elements.get(index);
     while (index > 0) {
         int parentIndex = (index - 1) / 2;
         T parent = elements.get(parentIndex);
         if (comparator.compare(item, parent) <= 0) {
             break;
         }
         elements.set(index, parent);
         index = parentIndex;
     }
     elements.set(index, item);
 }

 private void siftDown(int index) {
     T item = elements.get(index);
     int half = elements.size() / 2;
     while (index < half) {
         int childIndex = 2 * index + 1;
         T child = elements.get(childIndex);
         int rightIndex = childIndex + 1;
         if (rightIndex < elements.size() && comparator.compare(child, elements.get(rightIndex)) < 0) {
             childIndex = rightIndex;
             child = elements.get(childIndex);
         }
         if (comparator.compare(item, child) >= 0) {
             break;
         }
         elements.set(index, child);
         index = childIndex;
     }
     elements.set(index, item);
 }
}
