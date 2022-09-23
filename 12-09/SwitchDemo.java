/*Program :- Switch Case Demo
@author:- Mitul Mistry
@date - 09-Sep-2022 
*/

class SwitchDemo   // declaring class name as SwitchDemo
{
public static void main(String ...args)  // command line arguement
 {
	 
	 
	// Character grade = Character.parseCharacter		

	char days = args[0].charAt(0);
	 
	
	switch(days)
	{
	  case 'A': System.out.println("Mon");   // if the value is 1
			  break;
	  case 'B': System.out.println("tue");   // if the value is 2
			  break;
	  case 'C': System.out.println("wed");   // if the value is 3
			  break;
	  case 'D': System.out.println("thru");   // if the value is 4
			  break;
	  case 'E': System.out.println("fri");   // if the value is 5
			  break;
	  case 'F': System.out.println("sat");   // if the value is 6
			  break;
	  case 'G': System.out.println("sun");   // if the value is 7
			  break;
      default:System.out.println("wrong input");
				
	}
	
	
 }
	
}// end of class
