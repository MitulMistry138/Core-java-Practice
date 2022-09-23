/*Program :- Star Pattern
@author:- Mitul Mistry
@date - 14-Sep-2022 
*/

class StarPattern  //reverse  // declaring class name as Print Grade (nested if )
{
	static void pattern(int num)   //using if else to print even odd  
	{
		for(int i=1; i<=num; i++)
		 {
			  System.out.println();
		   for(int j=num; j>=i; j--)
		    {
		     System.out.print( " * " );
		    }
		
	     }
				
	}
	
	/*
	*
   	* *
	* * *
	* * * *
	* * *
	* *
	*
	*/
	static void fourthpattern(int num)   //using if else to print even odd  
	{		
		for(int i=1; i<=num; i++)
		 {
			  System.out.println();
		   for(int j=1; j<=i; j++)
		    {
		     System.out.print( " * " );
		    }
		
	     }
		for(int i=2; i<=num; i++)
		 {
			  System.out.println();
		   for(int j=num; j>=i; j--)
		    {
		     System.out.print( " * " );
		    }
		
	     }
				
	}
	
	
	
public static void main(String ...args)  // command line arguement
 {
	int number =Integer.parseInt(args[0]);
	fourthpattern(number);
 }
	
}// end of class
