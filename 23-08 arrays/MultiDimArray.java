/*
Program : Multi or 2D Array 
@author:  Mitul Mistry
@date :23-08-2022
*/

class MultiDimArray
{
    //method to print values 
	static void printValues()
	{
		int myArray[][] = {{1,2,3},{4,5,6},{7,8,9}};	
        for(int i=0;i<3;i++)  //for row values
		{
		for(int j=0;j<3;j++)   // for column values 
		{
			System.out.print(myArray[i][j]+ "  "); 
		}
		System.out.println();
	}
	}
       //calling main
public static void main(String args[])
{
		// calling printValues main
  printValues(); 
  
}
}
