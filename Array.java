/*
Program : Java Program to understand simple array 
@author:  Mitul Mistry
@date :23-08-2022
*/

class Array
{
 static void printArray(int num1, int num2 , int num3)  //Creating method named as printArray
 {
	int []myArray = new int[3];   //giving storage for the int value 
	myArray[0]=num1;                 //storing value as first element 
	myArray[1]=num2;                 // storing value of second element
	myArray[2]=num3;                 //storing value of 3rd element

for(int i=0;i<myArray.length;i++)      // Giving condition if integer i is greater than zero ,i is smaller than ht length of myArray
	{
	
	System.out.println("Element " +(i+1)+":" +myArray[i]);    // giving i+1 for the real value ,and myArray[i] is the input from the user
	
	}
	
}
 public static void main(String args[])
 {
 printArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));  // calling method and converting num value to integer  
 }
}