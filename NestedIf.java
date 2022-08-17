/*
Program : More about NestedIf
@author:  Mitul Mistry
@date :17 -08 -2022
*/

class NestedIf
{
	static void takeAdmission()
	{
		float totalMarks= 78.9f;
		float pcmMarks=88.9f;
		if(totalMarks>75)
		{
			if(pcmMarks>85)
				System.out.println("----You are eligible for our college(b.tech)---");
			else 
				System.out.ptintln("-----You are eligible for our college(bca)--");
			
		}
        else 
         System.out.ptintln("-----You are not eligible for our college--");
	 System.out.ptintln("---Thank you!----");
	}
	
	public static void main(String args[])
	{
	
		takeAdmission();		
	}
}	