/*
program :- get property or print java version
@author:- Mitul Mistry
@date - 07-Sep-2022 
*/

class Version   // declaring class name as Version
{
public static void main(String ...args)  // command line arguement
{
	
		float divisor= Float.parseFloat(args[0]);
	System.out.println("value : "+System.getProperty("java.version"));   // printing the expected output 
	}
	
}// end of class
