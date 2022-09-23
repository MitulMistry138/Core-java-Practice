/*
Program : Java Program to understand simple array 
@author:  Mitul Mistry
@date :23-08-2022
*/

class SimpleArray
{
 static void printArray(int num1, int num2)  //Creating method named as printArray
 {
	int []myArray = new int[10];   //giving storage for the int value 
	myArray[0]=num1;                 //storing value as first element 
	myArray[1]=num2;                 // storing value of second element
	
	System.out.println("First" +myArray[0]); // Display first element
	System.out.println("Second" +myArray[1]); //display Second element 
	 
  }
 public static void main(String args[])
 {
	 // calling method printArray 
 printArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
 }
}
