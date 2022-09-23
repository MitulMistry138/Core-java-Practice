/*Program :- if else demo1
@author:- Mitul Mistry
@date - 09-Sep-2022 
*/

class IfElseDemo1   // declaring class name as IFElseDEmo1
{
public static void main(String ...args)  // command line arguement
 {
	int age= Integer.parseInt(args[0]);
	
    //example of operators
	if(age>=18)
	{
		System.out.println("You can vote ");
	}
	else
	{
		System.out.println("too young");
	}
 }
	
}// end of class
