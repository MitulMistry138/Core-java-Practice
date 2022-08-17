/*
Program : More about NestedIf
@author:  Mitul Mistry
@date :17 -08 -2022
*/

class NestedIf
{
	static void takeAdmission()
	{
		float totalMarks=75.1f;
		float pcmMarks=78.2f;
		if(totalMarks>75)
		{
			if(pcmMarks>85)
				System.out.println("----You are eligible for our college(b.tech)---");
			else 
				System.out.println("-----You are eligible for our college(bca)--");
			
		}
        else 
         System.out.println("-----You are not eligible for our college--");
	 System.out.println("---Thank you!----");
	}
	
	public static void main(String args[])
	{
	
		takeAdmission();		
	}
}	