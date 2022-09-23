/*
Program : Switch Cases Basic
@author:  Mitul Mistry
@date :17 -08 -2022
*/

class SimpleSwitch
{
	static void printDay()
	{
		int day= 6; // input given 
		switch(day)
		{
			case 1: System.out.println("Monday");
			        break;
			case 2: System.out.println("Tues");
			        break;
 			case 3: System.out.println("Wed");
			        break;
			case 4: System.out.println("Thurs");
			        break;
			case 5: System.out.println("fri");
			        break;
			case 6: System.out.println("sat");
			        break;
			case 7: System.out.println("sun");
			        break;
			default: System.out.println("Wrong input");	
		}
		
		
	}
	
	public static void main(String args[])
	{
	
		printDay();		
	}
}	
