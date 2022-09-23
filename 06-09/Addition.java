/*
program :- Addition java program 
@author:- Mitul Mistry
@date - 06-Sep-2022 
*/

class Addition   // declaring class name as hello
{
public static void main(String ...args)  // command line arguement
{
	
	int num1= Integer.parseInt(args[0]);
	int num2= Integer.parseInt(args[1]);
	
	System.out.println(num1+num2); 
	
	
	float num3= Float.parseFloat(args[2]);
	float num4= Float.parseFloat(args[3]);
	
	System.out.println(num2+num3);   // printing the expected output 
	}
	
}// end of class