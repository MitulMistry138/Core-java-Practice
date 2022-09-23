/*
Program : Multi Dimension pattern 
@author:  Mitul Mistry
@date :23-08-2022
*/

class EnhancedMultiDimArray
{
    //method to print values 
	static void printValues()
	{
        for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j); 
		}
		System.out.println("");
	}
	}
       //calling main
public static void main(String args[])
{
		// calling printValues main
  printValues(); 
  
}
}