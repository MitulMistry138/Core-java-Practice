/*
program :- Creating an class named as mobilephone and including all its properties
author:- Mitul V Mistry 
date :- 29-08-2022 
*/

import static java.lang.System.*;    // importing package java.lang

//Declaring class named as Car 
class MobilePhone
{
    // instance variables
	int modelnum;
	String brand;
	int cost;
	double rating;
	String name;
	
	
	// method to print student details
	void printDetails()
	{
		out.println("Name: "+name);
		out.println("Model: "+modelnum);
		out.println("Brand is :  "+brand);
		out.println("Cost: "+cost);
		out.println("Rating :"+rating);

	}
	 void inputDetails(int m_n ,String b_name ,String br_name ,int c_price ,double r_ating)
	 {
		modelnum= m_n;
		name = b_name;
		brand = br_name;
		cost  = c_price;
		rating = r_ating;
		 
	 }



public static void main(String ...args)
	{
	    // creating object of the class named as Car    
		MobilePhone mi= new MobilePhone();
			
	    //creating object of the class named as Car   
		
		MobilePhone apple= new MobilePhone();
		            
		// calling both main method 
		mi.inputDetails(11 , "Note 11 Pro", " MI" ,38500, 8.5f);
		apple.inputDetails(5 , "Iphone 12 ", " Apple" , 50000, 9.0f);
		mi.printDetails();
		apple.printDetails();
		
					
	}
	
}
