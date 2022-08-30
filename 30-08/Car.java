/*
program :- Implementing class
author:- Mitul V Mistry 
date :- 29-08-2022 
*/

import static java.lang.System.*;    // importing package java.lang

//Declaring class named as Car 
class Car
{
    // instance variables
	int modelnum;
	String name;
	int cost;
	double rating;
	
	// method to print student details
	void printDetails()
	{
		out.println("Name: "+name);
		out.println("Model: "+modelnum);
		out.println("Cost: "+cost);
		out.println("Rating :"+rating);
	}
	 void inputDetails(int m_n ,String b_name ,int c_price ,double r_ating)
	 {
		modelnum= m_n;
		name = b_name;
		cost  = c_price;
		rating = r_ating;
		 
	 }
	 
	
}

class CarDetails
{
	

public static void main(String ...args)
	{
	    // creating object of the class named as Car    
		Car supra= new Car();
		
		// calling both main method 
		supra.inputDetails(5 , "MK", 500000, 9.9f);
		supra.printDetails();
		
		
	
	}
	
}
