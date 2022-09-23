/*Program :- Trenary Operator (Symbol (?:))
@author:- Mitul Mistry
@date - 12-Sep-2022 
*/

class TrenaryDemo   // declaring class name as Print Grade (nested if )
{
	static void evenOdd(int num)   //using if else to print even odd  
	{
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
	
	}	
	
	static void trenaryEvenOdd(int num) 	// using trenary operator 
	{
	
		String result=(num%2==0)?"even":"odd";
		System.out.println(result);
	
	}
	
public static void main(String ...args)  // command line arguement
 {
	int number =Integer.parseInt(args[0]);
	trenaryEvenOdd(number);
 }
	
}// end of class
