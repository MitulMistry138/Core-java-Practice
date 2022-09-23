/*
Program : More about NestedIf
@author:  Mitul Mistry
@date :17 -08 -2022
*/

class MilitarySelection
{
	static void takeAdmission()
	{
		float totalHeight=152.3f;
		float totalMarks=69.5f;
		if(totalHeight>152.1)
		{
			if(totalMarks>65)
				System.out.println("----You are eligible for our campus------");
			else 
				System.out.println("-----You are eligible for our coastguard campus-----");
			
		}
        else 
         System.out.println("-----You are not eligible for our campus--");
	 System.out.println("---Thank you!----");
	}
	
	public static void main(String args[])
	{
	
		takeAdmission();		
	}
}	
