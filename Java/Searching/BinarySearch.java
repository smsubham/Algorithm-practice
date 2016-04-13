

import java.util.Scanner;

/**
 * Implementation of binary search algorithm in java
 * 
 * <code>
 * BinarySearch(A[0..N-1], value) {
 *    low = 0
 *    high = N - 1
 *     while (low <= high) {
 *        // invariants: value > A[i] for all i < low
 *                       value < A[i] for all i > high
 *        mid = (low + high) / 2
 *        if (A[mid] > value)
 *            high = mid - 1
 *        else if (A[mid] < value)
 *            low = mid + 1
 *        else
 *            return mid
 *    }
 *    return not_found // value would be inserted at index "low"
 * }
 * <\code>
 * 
 * This searching technique will only work for sorted array.
 * 
 * For more information on Binary Search use below link
 * https://en.wikipedia.org/wiki/Binary_search_algorithm
 * 
 * @author Subham Mishra
 * */
class BinarySearch 
{
  public static void main(String args[])
  {
    int c, first, last, middle, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
 
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    first  = 0;
    last   = n - 1;
 
    while( first <= last )
    {
      middle = (first + last)/2;
      if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else if ( array[middle] < search ) //true then element must be in right side of middle
        first = middle + 1;    
      else
         last = middle - 1;
   }
   if ( first > last ) //true if all possiblties are already checked still element not found
      System.out.println(search + " is not present in the list.\n");
  }
}
