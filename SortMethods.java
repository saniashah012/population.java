/**
 *	SortMethods - Sorts an array of Integers in ascending order.
 *
 *	@author Sania Shah
 *	@since	January 19, 2021
 */
public class SortMethods 
{
	
	/**
	 *	Bubble Sort algorithm - in ascending order
	 *	@param arr		array of Integer objects to sort
	 */
	public void bubbleSort(Integer [] arr) 
	{
         for (int outer = 1; outer < arr.length; outer++)

        for (int inner = arr.length - 1; inner > outer; inner--)

            if (arr[inner-1] > arr[inner])
            {
                int temp = arr[inner-1];
                arr[inner-1] = arr[inner];
                arr[inner] = temp;
            }


	}
	
	/**
	 *	Swaps two Integer objects in array arr
	 *	@param arr		array of Integer objects
	 *	@param x		index of first object to swap
	 *	@param y		index of second object to swap
	 */
	private void swap(Integer[] arr, int x, int y) 
	{
		Integer temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	/**
	 *	Selection Sort algorithm - in ascending order (you implement)
	 *	@param arr		array of Integer objects to sort
	 */
	public void selectionSort(Integer [] arr) 
	{
		for(int n = arr.length; n > 1; n--)
		{
			int iMax = 0;
			for(int i = 1; i < n; i++)
			{
				if(arr[i] > arr[iMax])
				
					iMax = i;
			}

			swap(arr, iMax, n-1);
		}
	}
	
	/**
	 *	Insertion Sort algorithm - in ascending order (you implement)
	 *	@param arr		array of Integer objects to sort
	 */
	public void insertionSort(Integer [] arr) 
	{
		for(int n = 1; n < arr.length; n++)
		{
			int aTemp = arr[n];

			int i = n;
			while(i > 0 && aTemp < arr[i-1])
			{
				arr[i] = arr[i-1];
				i--;
			}
			arr[i] = aTemp;
		}
	}
	
	/**
	 *	Merge Sort algorithm - in ascending order (you implement)
	 *	@param arr		array of Integer objects to sort
	 */
	public void mergeSort(Integer [] arr, int l, int r) 
	{
		if (l < r) 
		{
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
	}

	public void merge(Integer [] arr, int l, int m, int r)
	{
		int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            }
            else 
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) 
        {
            arr[k] = L[i];
            i++;
            k++;
        }
         while (j < n2) 
         {
            arr[k] = R[j];
            j++;
            k++;
        }
	}
	
	/**
	 *	Print an array of Integers to the screen
	 *	@param arr		the array of Integers
	 */
	public void printArray(Integer[] arr) 
	{
		if (arr.length == 0) System.out.print("(");
		else System.out.printf("( %4d", arr[0]);
		for (int a = 1; a < arr.length; a++) 
		{
			if (a % 10 == 0) System.out.printf(",\n  %4d", arr[a]);
			else System.out.printf(", %4d", arr[a]);
		}
		System.out.println(" )");
	}
	
	public static void main(String[] args) 
	{
		SortMethods se = new SortMethods();
		se.run();
	}
	
	public void run() 
	{
		Integer[] arr = new Integer[10];
		// Fill arr with random numbers
		for (int a = 0; a < 10; a++)
					arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nBubble Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();
		
		
/*		for (int a = 0; a < 10; a++)
			arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nSelection Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		selectionSort(arr);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();
*/
		
/*		for (int a = 0; a < 10; a++)
			arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nInsertion Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		insertionSort(arr);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();
*/
		
/*		for (int a = 0; a < 10; a++)
			arr[a] = (int)(Math.random() * 100) + 1;
		System.out.println("\nMerge Sort");
		System.out.println("Array before sort:");
		printArray(arr);
		System.out.println();
		mergeSort(arr, 0, arr.length-1);
		System.out.println("Array after sort:");
		printArray(arr);
		System.out.println();
*/

	}
}