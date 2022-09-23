/*Program :- Print Grade
@author:- Mitul Mistry
@date - 12-Sep-2022 
*/

class PrintGrade   // declaring class name as Print Grade (nested if )
{
public static void main(String ...args)  // command line arguement
 {
	float totalmarks = Float.parseFloat(args[0]); // taking input from user
	
	
    //example of nested if 
	if(totalmarks>80) 
		{	
	     System.out.println("Your Grade is A");	
	    }
	
           else if((totalmarks>60) && (totalmarks<80))  // else for inner if 
            {
            System.out.println("B ");   // print the grade B
	     	 }	
     
	            else if((totalmarks>50) && (totalmarks<60))  // else for inner if 
                {
                System.out.println("C "); //rint the grade C
		        }	
     
	              else if((totalmarks>45) && (totalmarks<50))  // else for inner if 
                   {
                   System.out.println("d");  // print the grade D
		           }	
     
	               else if((totalmarks>25) && (totalmarks<45))  // else for inner if 
                   {
                    System.out.println("E "); // print the grade D
		            }	
      
	           //end of outer if 
	else 
	{
		System.out.println("U r failed with grade F");  
	}
 }
	
}// end of class
