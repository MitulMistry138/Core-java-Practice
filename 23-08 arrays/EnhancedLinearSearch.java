/*
Program : finding the element in an array
@author:  Mitul Mistry
@date :23-08-2022
*/

class EnhancedLinearSearch
{
    //method to find the number in an array 
	static void findNumber(int searchNum)
	{
		int []arr={36,15,24,26,35,45};
		
		boolean flag = false;
		
		//traversing the array 
		
		for(int i:arr)
		{
            if(searchNum==i)		
            {    
			flag=true;
			break;
			}
		}
		
		
		if(flag == true)
		System.out.println("the number " + searchNum + "  is present in the array");
		else
		System.out.println("the number " + searchNum + "  is not present in the array");	
		
		
	}
       //calling main
public static void main(String args[])
{
		// calling findNumber main
  findNumber(Integer.parseInt(args[0]));
  
}
}
