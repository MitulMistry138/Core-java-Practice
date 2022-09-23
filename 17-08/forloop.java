/*
Program : For loop;
@author:  Mitul Mistry
@date :17 -08 -2022
*/

class ForLoop
{
	// static void printDay()   // Method created as printDay
	// {
		int count= 6; // input given 
		// System.out.println("number");
		
		// for (;count<=10;)
		
		// {
		// System.out.println(count);
		// count++;
				
		// }
		
		// static void infiniteFor()
		// {
			// for(;;)
			// {
			// System.out.println("Helloww");
            // }
        // }

        static void calcFactorial(int num)
		{
			int result=3;
		  int c1;
		  for(c1=num;c1>0;c1--)
		  {
			result*=c1;  
		  }			  
		   System.out.println("The Factorial of number " +num +"is:"+result);
		}
		
		
	// }
		
	public static void main(String args[])
	{
	  System.out.println(Thread.currentThread().getName());
	  
	  int factNumber= Integer.parseInt(args[0]);
	  calcFactorial(factNumber);
      
	  
	}
}	



