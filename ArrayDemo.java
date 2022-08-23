/*
Program : Java Program to understand simple array 
@author:  Mitul Mistry
@date :23-08-2022
*/

class ArrayDemo
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
static void initArray()
	{
		int newArray[] ={24,15,45,55,55,65}; //implicit array
		System.out.println("Size of newArray is:" + newArray.length);
		
		for(int i=0;i<newArray.length;i++)
		{
		
		System.out.println("Element" +(i+1)+": "+newArray[i]);
		}
		
        String names[] ={"M<itul","Mistry","Vallabh","Bindu","vadgama"}; //implicit array
		System.out.println("Size of newArray is:" + names.length);
		
		for(int i=0;i<names.length;i++)
		{
		
		System.out.println("Element" +(i+1)+": "+names[i]);
		}
		
		
}



 public static void main(String args[])
 {
 initArray();  // calling method and converting num value to integer  
 }
}