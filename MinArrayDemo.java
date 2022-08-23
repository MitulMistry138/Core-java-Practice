/*
Program : finding the element in an array
@author:  Mitul Mistry
@date :23-08-2022
*/

class MinArrayDemo
{
    //method to calculate minimum number in an array 
	static void minNumber()
	{
		int []arr={36,15,24,26,35,45};
		int mNum=arr[2];
	
		//traversing the array 
		
		for(int i=1;i<arr.length;i++)
		{
            if(mNum>arr[i])    // checking the number is greater than th number in array
				mNum=arr[i];  //assigning lesser value
		}
		
		System.out.println("The Minimum number in the array is :" +mNum);	
				
	}
       //calling main
public static void main(String args[])
{
		// calling minNumber main
  minNumber();
  }
}