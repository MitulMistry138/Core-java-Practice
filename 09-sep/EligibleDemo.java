/*Program :- Eligibilty of college 
@author:- Mitul Mistry
@date - 09-Sep-2022 
*/

class EligibleDemo   // declaring class name as IFElseDEmo1
{
public static void main(String ...args)  // command line arguement
 {
	float totalmarks = Float.parseFloat(args[0]);
	float pcmMarks = Float.parseFloat(args[1]);

	
    //example of nested if 
	if(totalmarks>60) 
	{
		if((totalmarks>=80)||(pcmMarks>=85))
		{	
	     System.out.println("you are  eligible");	
	    }
		// end of inner if 
		
		
	   else  // else for inner if 
         {
          System.out.println("you are eligible for admisiion but excep b.tech ");
		 }	
     }
		//end of outer if 
	else 
	{
		System.out.println("You are not eligible");
	}
 }
	
}// end of class
