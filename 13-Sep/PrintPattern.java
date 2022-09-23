/*Program :- Print Pattern
@author:- Mitul Mistry
@date - 12-Sep-2022 
*/

class PrintPattern   // declaring class name as Print Grade (nested if )
{
	static void pattern(int num)   //using if else to print even odd  
	{
		for(int i=1; i<=num; i++)
		 {
		   for(int j=1; j>=i; j++)
		    {
		     System.out.println("*" + " ");
		    }
		 System.out.println(i);
	     }
				
	}
	
public static void main(String ...args)  // command line arguement
 {
	int number =Integer.parseInt(args[0]);
	pattern(number);
 }
	
}// end of class
