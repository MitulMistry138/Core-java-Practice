/*
program :- Program to demonstrate Varargs in aray 
author:- Mitul V Mistry 
date :- 24-08-2022
*/

class VarargsDemo	
{
	static void printArrayValues(int []arr)
	{
	 System.out.println();
	 System.out.println("Print element");
	 for(int i:arr)
	 {
		 System.out.print(i+" ");
	 }
	}
	
	static void betterPrint(int ...x)   // elipse operator
	{
	 System.out.println();
	 System.out.println("Print array");
	 for(int i:x)
	 {
		 System.out.print(i+" ");
	 }
	}
	static void betterPrint(String ...x)   // using string operator
	{
	 System.out.println();
	 System.out.print("String ");
	 System.out.println("Print array");
	 for(String i:x)
	 {
		 System.out.print(i+" ");
	 }
	}
	static void betterPrint2(float f1,String ...x)   // using 2 operator float and string
	{
	 System.out.println("Val of f1 is : "+f1);
	 System.out.print("String ");
	 System.out.println("Print array");
	 for(String i:x)
	 {
		 System.out.print(i+" ");
	 }
	}
	
   public static void main(String args[])
   {
	   int r1[]={};
	   int r2[]={3,4};
	   int r3[]={45,85,96,89};
	   
       // printArrayValues(r1);	   
       // printArrayValues(r2);	 
       // printArrayValues(r3);
	   
	   // betterPrint(r1);
       // betterPrint(r2);
	   // betterPrint(r3);
	   // betterPrint("Vallabh","Mitul","Mistry");
	  // betterPrint();  // ambiguity
	  
	  betterPrint2(5.6f, "Mitul");
	  betterPrint2(2.6f, "dh","hu");
	  
   }  
}

//Print the largest and the second largest number of the array 