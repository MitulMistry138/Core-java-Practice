/*
Program : finding the element in an array
@author:  Mitul Mistry
@date :23-08-2022
*/

class LinearSearch
{
    //method to find the number in an array 
	static void findNumber()
	{
		int []arr={36,15,24,26,35,45};
		boolean flag = false;
		
		//traversing the array 
		
		for(int i=0;i<arr.length;i++)
		{
            if(searchNum==arr[i])		
                flag=true;
			break;	
		}
		
		if(flag == true)
		System.out.println("the number " + searchNum + "is present in the array");
		else
		System.out.println("the number " + searchNum + "is not present in the array");	
		
		
	}
       //calling main
public static void main(String args[]0
{
	// calling findNumber main
  findNumber(Interger.parseInt(args[0]);
  
}
}
