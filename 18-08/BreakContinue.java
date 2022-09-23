/*
Program : Java Program to understand break and continue ststement 
@author:  Mitul Mistry
@date :18 -08 -2022
*/

class BreakContinue
{
	// Break method to understand break keyword
	static void callBreak() 
	{
	    for(int i=0;i<10;i++)
		{
			
			if(i==6)
				break;
			System.out.println(i);  //Print the value of int
		}
		
	}
	
	// method to understand continue keyword
	static void callContinue() 
	{
	    for(int i=0;i<10;i++)
		{
			
			if(i==6)
				continue;
		    System.out.println(i);	
		}
		
	}
	
	public static void main(String args[])
	{
		
		//call break();
		callContinue();
		
	}
	
		
	
}
	


