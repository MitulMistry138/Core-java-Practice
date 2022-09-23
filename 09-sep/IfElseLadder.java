/*Program :- if else ladder demo2
@author:- Mitul Mistry
@date - 09-Sep-2022 
*/

class IfElseLadder   // declaring class name as IFElseDEmo1
{
public static void main(String ...args)  // command line arguement
 {
	int number1 = Integer.parseInt(args[0]);
	int number2 = Integer.parseInt(args[1]);
	int number3 = Integer.parseInt(args[2]);
	
    //example of operators
	if((number1 == number2)&&(number1 == number3)) 
	{
	   System.out.println("all number are equals");	
	}
	 else if((number1>number2)&&(number1>number3))
	    {
		 System.out.println("number  "+number1+" is greatest ");
		 }
	     else if(number2>number3) 
            {
		     System.out.println("number "+number2+" is greatest ");
            }
              else
             {
              System.out.println("number "+number3+"is greatst ");
             }
	
 }
	
}// end of class
