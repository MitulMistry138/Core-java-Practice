/*
Program:- Star Pattern (left triangle)
				   *   i=1
			     * *   i=2 
			   * * *   i=3 
             * * * *	i=4		  
*/

class StarPattern2  //reverse  // declaring class name as Print Grade (nested if )
{
	static void firstpattern(int noOfRows)   //using if else to print even odd  
	{
		for(int i=1; i<=noOfRows; i++)         // outer loop for my rows 
		 {
		   System.out.println();
		   for(int spaces=noOfRows-i; spaces>0; spaces--)
		    {
		     System.out.print(" ");
		    }
			for(int j=1;j<=i; j++)				// inner looop for my column				
       		 {
			 System.out.print(" *");
	    	 }
		 
	     }
		 // for(int i=2; i<=noOfRows; i++)
		 // {
		   // System.out.println();
		   // for(int spaces=noOfRows-i; spaces>0; spaces--)
		    // {
		     // System.out.print(" ");
		    // }
			// for(int j=2;j>=i; j--)
       		 // {
			 // System.out.print("*");
	    	 // }
		 
	     // }
		 
		
	}
	
public static void main(String ...args)  // command line arguement
 {
	int number =Integer.parseInt(args[0]);
	firstpattern(number);
 }
	
}