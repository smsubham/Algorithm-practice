    import java.util.Scanner;

    /**
     * Java Implementation of Heap Sort
     * <code>
     * procedure heapsort(a, count) is
     *input: an unordered array a of length count
     *(Build the heap in array a so that largest value is at the root)
     *heapify(a, count)
     *(The following loop maintains the invariants that a[0:end] is a heap and every element
     *beyond end is greater than everything before it (so a[end:count] is in sorted order))
     *end ← count - 1
     *while end > 0 do
     *  (a[0] is the root and largest value. The swap moves it in front of the sorted elements.)
     *  swap(a[end], a[0])
     *  (the heap size is reduced by one)
     *  end ← end - 1
     *  (the swap ruined the heap property, so restore it)
     *  siftDown(a, 0, end)
     * </code>
     * 
     * @author Subham Mishra
     **/
     
    public class HeapSort 

    {    
        private static int N;

        /* Sort Function */

        public static void heapSort(int arr[])

        {       

            heapify(arr);        

            for (int i = N; i > 0; i--)

            {

                swap(arr,0, i);

                N = N-1;

                maxheap(arr, 0);

            }

        }     

        /* Function to build a heap */   

        public static void heapify(int arr[])
        {
            N = arr.length-1;
            for (int i = N/2; i >= 0; i--)
                maxheap(arr, i);        
        }

        /**
        * 
        *Function to swap largest element in heap
        * 
        **/        

        public static void maxheap(int arr[], int i)
        { 
            int left = 2*i ;
            int right = 2*i + 1;
            int max = i;
            if (left <= N && arr[left] > arr[i])
                max = left;
            if (right <= N && arr[right] > arr[max])        
                max = right;
            if (max != i)
            {
                swap(arr, i, max);
                maxheap(arr, max);
            }
        }    

        /**
         * 
        *Function to swap two numbers in an array 
        *
        **/

        public static void swap(int arr[], int i, int j)
        {
           int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp; 
        }    
        
        public static void main(String[] args) 
        {
            Scanner scan = new Scanner( System.in );        
            System.out.println("Heap Sort in java Demo");
            int n, i;    
            System.out.println("Enter number of integer elements");
            n = scan.nextInt();    
            int arr[] = new int[ n ];
             System.out.println("\nEnter "+ n +" integer elements");
            for (i = 0; i < n; i++)
                arr[i] = scan.nextInt();
            heapSort(arr);
            System.out.println("\nElements after sorting ");        
            for (i = 0; i < n; i++)
                System.out.print(arr[i]+" ");            
            System.out.println();            
        }    
    }
