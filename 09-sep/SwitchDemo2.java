/*Program :- Switch Case Demo
@author:- Mitul Mistry
@date - 09-Sep-2022 
*/

class SwitchDemo2   // declaring class name as SwitchDemo
{
public static void main(String ...args)  // command line arguement
 {
	char grade= 'A';
	switch(grade)
	{
	  case 'A': System.out.println("Excelent");
			  break;
	  case 'B': System.out.println("better");
			  break;
	  case 'C': System.out.println("good");
			  break;
	  case 'D': System.out.println("fail");
			  break;
	  
      default:System.out.println("wrong input");
				
	}
	
	
 }
	
}// end of class
