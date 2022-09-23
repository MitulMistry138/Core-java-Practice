/*
Program: Program to make a class and object
@author: mitul mistry
@date : 19- September- 2022
*/
import java.util.Scanner;

class LaptopShop
{
	String brand;
	float screenSize;
	int model;
	double price;
	String processor;
	String memory;
	
	void insertLaptop(String brand, float screenSize, int model, double price, String processor, String memory)
	{
		this.brand=brand;
		this.screenSize=screenSize;
		this.model=model;
		this.price=price;
    }
	
	void display()
	{
		System.out.println(" Brand is :  "+brand);
		System.out.println(" screenSize is :  "+screenSize);
		System.out.println(" model is :  "+model);
		System.out.println(" price is :  "+price);
		System.out.println(" processor is :  "+processor);
		System.out.println(" Memory is :  "+memory);
		
	}
	

}

class Laptop
{
	public static void main(String ...args)
	{
		// creating object 
	  LaptopShop laptop1 = new LaptopShop();
	  
	  
	  Scanner sc= new Scanner(System.in);
	  
	  
	  
	  System.out.println("Enter the brand name : ");
	  laptop1.brand= sc.next();
	  
	  System.out.println("Enter the screenSize : ");
	  laptop1.screenSize= sc.nextFloat();
	  
	  System.out.println("Enter the model name : ");
	  laptop1.model= sc.nextInt(3);
	  
	  System.out.println("Enter the price : ");
	  laptop1.price= sc.nextDouble();
	  
	  System.out.println("Enter the proseccor : ");
	  laptop1.processor= sc.next();
	  
	  	System.out.println("Enter the memory : ");
	  laptop1.memory= sc.next();
	  	
		
		// calling insert method 
		laptop1.insertLaptop(laptop1.brand,laptop1.screenSize,laptop1.model,laptop1.price,laptop1.processor,laptop1.memory);
		
		System.out.println();
		System.out.println();
		System.out.println("YOur laptop details are:-");
		laptop1.display();	
		
	}
	
}