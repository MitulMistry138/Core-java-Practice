/*Program :- Print AScii Value
@author:- Mitul Mistry
@date - 12-Sep-2022 
*/

class AsciiValue   // declaring class name as Print Grade (nested if )
{
public static void main(String ...args)  // command line arguement
 {
	char cValue = args[0].charAt(0); // taking input from user
	int asciiVal= cValue;
	System.out.println("AScii value of " +cValue+ " is "+asciiVal);
	  
 }
	
}// end of class
