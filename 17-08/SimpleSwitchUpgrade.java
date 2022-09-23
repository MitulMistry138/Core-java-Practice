/*
Program : Switch Cases Upgrade
@author:  Mitul Mistry
@date :17 -08 -2022
*/

class SimpleSwitchUpgrade
{
	static void printDay()   // Method created as printDay
	{
		int day= 5; // input given 
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
			        
			case 6: System.out.println("sat");
			        break;
			case 7: System.out.println("sun");
			        break;
			default: System.out.println("Wrong input");	
		}
		
		
	}
	
	// static void printNoOfDays()
	// {
		// int num= 2; //input number given 
        // switch(num)
		// {
		// case 1-> System.out.println("Monday");
			                                                     
			// case 2-> System.out.println("Tues");
			        
 			// case 3-> System.out.println("Wed");
			        
			// case 4-> System.out.println("Thurs");
			        
			// case 5-> System.out.println("fri");
			        
			// case 6-> System.out.println("sat");
			        
			// case 7-> System.out.println("sun");
			        
			// default-> System.out.println("Wrong input");		
		// }
 				
	// }	
	
		static void printMonth()	
        {
			int month= 4;
			switch(month)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: System.out.println(" Number of Days in the month number "+ month +"are 31 days");
				        break;
                case 4:
				case 6:
				case 9:
				case 11: System.out.println(" Number of Days in the month number "+ month +"are 30 days");
				        break;
				case 2: System.out.println(" Number Of Days in the month number"+ month +"are 28 days ");
				        break;
				default: System.out.println("Wrong input ");
				
			}
		}	
	
	public static void main(String args[])
	{
	
		printMonth();		
	}
}	