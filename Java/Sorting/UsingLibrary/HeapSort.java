import java.util.PriorityQueue;
/**
*Source : https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Heapsort
*
**/
public static <E extends Comparable<? super E>> void heapsort(E[] array) {
    
    // Java's PriorityQueue class functions as a min heap
    PriorityQueue<E> heap = new PriorityQueue<E>(array.length);
    
    // Add each array element to the heap
    for (E e : array)
        heap.add(e);
    
    // Elements come off the heap in ascending order
    for (int i=0; i<array.length; i++)
        array[i] = heap.remove();
    
}
