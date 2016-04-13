/**
 * 
 * Recursive implemmentation of Binary Search
 * 
 * <code>
 * BinarySearch(A[0..N-1],ow, high , value) {
 *   // invariants: value > A[i] for all i < low
 *                   value < A[i] for all i > high
 *    if (high < low)
 *        return not_found // value would be inserted at index "low"
 *    mid = (low + high) / 2
 *    if (A[mid] > value)
 *        return BinarySearch(A, value, low, mid-1)
 *    else if (A[mid] < value)
 *        return BinarySearch(A, value, mid+1, high)
 *    else
 *        return mid
 *}
 * <\code>
 * 
 * @author Subham Mishra
 * */
public class BinarySearchRecursive {
 
    public static int binarySearchRecursive(int[] sortedArray, int start, int end, int key) {
         
        if (start < end) {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid]) {
                return binarySearchRecursive(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return binarySearchRecursiveR(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;  
            }
        }
        return -(start + 1); 
    }
 
    public static void main(String[] args) {
         
        int[] array;
        
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
 
    System.out.println("Enter value to find");
search = in.nextInt();
        int index = binarySearchRecursion(array,0,array.length,search);
        if(index<0)
        return;
        else
        System.out.println("Found " + search +" at "+index+" index");
  
    }
}
