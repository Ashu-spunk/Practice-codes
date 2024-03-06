package Oops;			/*code demonstrates the usage of the Bubble Sort algorithm to sort an array of integers in ascending order.
												It also showcases the concept of passing arrays by reference in Java.
																																	*/
public class Call_by_Reference
{
	  // Method to sort the array in ascending order
	public int sort(int b[]) 
	{
		 // Outer loop to iterate over each element of the array
		for(int i=0;i<b.length;i++)
		{
			// Inner loop to compare the current element with the rest of the elements
            // Adjusted loop condition to avoid unnecessary iterations
			for(int k=b.length-1;k>i;k--)
			{
				if(b[i]>b[k])
				{							 // Swap the elements if the current element is greater
					int temp=b[i];
					b[i]=b[k];
					b[k]=temp;
				}
			}
		}
		return 0;	 // Return 0 as sorting is complete (not really necessary)
	}

	public static void main(String[] args)
	{
		int arr[]= {18,45,9,10,11};									// Initialize an array
		Call_by_Reference cbr=new Call_by_Reference();			 // Create an instance of Call_by_Reference class
		cbr.sort(arr);														// Call the sort method to sort the array
		System.out.print("Sorted array is as follows:");
		for(int e:arr)													 // Print the sorted array
		{														
			System.out.print(+e+"   ");
		}

	}

}
