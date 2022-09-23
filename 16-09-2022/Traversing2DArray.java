/*

program : traversing 2d array

*/

import java.util.Scanner;
class Traversing2DArray
{

	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		int rows=0,cols=0;
	   System.out.println("Enter no of rows:");
	   rows= sc.nextInt();
	   System.out.println("Enter no of cols:");
	   cols= sc.nextInt();
       
	   int arr[][] = new int[rows][cols];
	   
	   for(int i=0;i<rows;i++)
	   {
		   for(int j=0;j<cols;j++)
		   {
			   arr[i][j]=sc.nextInt();
		   }
	   }
		System.out.println(" Array elements are:");
		displayArray(arr);

	}
	
    static void displayArray(int myArray[][])
	{
		for(int[] arrayRows:myArray)
		{
			for(int[] myrow:arrayRow)
			{
				System.out.print(myrow+ " ");
			}
			System.out.println();
		}
		
		
	}
	
	
public static void main(String ...args)
{
	inputArray();
}
}