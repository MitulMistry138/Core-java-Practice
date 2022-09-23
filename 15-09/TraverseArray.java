/*Program :- Scanner
@author:- Mitul Mistry
@date - 15-Sep-2022 
*/

import java.util.Scanner;

class TraverseArray
{	
	// method to input elements in an array
	static void inputDetails()
	{
		Scanner sc= new Scanner(System.in);  // Scanner object for input of elements
		int arr[]= new int[5];  // creating an array
		
		// loop to enter 10 elements
		for(int i=0;i<5;i++)
		{
		arr[i]=sc.nextInt(); // taking  integer inputs
				
		}
		System.out.println("---------element ares-----");
		//end of for loop
		displayEnhancedFor(arr);
	}	
	//end of inputDetails
	
	static void displayEnhancedFor( int ar[])
	{	
		
		for(int i:ar)
		{
			if(i<0)
			{
				System.out.println(" the element is " +i);
			}
						
		}
		
	}
	
	public static void main(String ...args)
	{
	  inputDetails();	
		
		
	}
	
	
}
