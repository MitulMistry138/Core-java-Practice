/*
Program : to Create a Library using object and class
@author : Mitul.V.Mistry
@date   : 20-09-2022

*/


import java.util.*; // importing java.util package 

// Declaring Class
class Library
{
	private String bookName;
	private String bookAuthor;
	double bookPrice;
	
	// creating method to insert  details 
	
 void insertLibrary()
  {
	Scanner sc= new Scanner(System.in);     // creating scanner class
	
	System.out.println("Enter the details of Library:");
		
	// taking into from user
	System.out.println("Enter the book NAme:");
	this.bookName=sc.next();
	
	// taking input from user
	System.out.println("Enter the name of  author:");
	this.bookAuthor=sc.next();
	
	//taking input from user
	System.out.println("Enter the Price of book:");
	this.bookPrice=sc.nextDouble();
   }
 // end of insert method
 
 // creating display method
 void display()
 {
     System.out.println("Library Name: "+this.bookName+" "+" Author Name : "+this.bookAuthor+" "+" Price of Book "+this.bookPrice);
  }
  
  // end the display method
 }
 
 
 // declaring class named as LibraryInput
 
class LibraryInput
{
	public static void main(String ...args)
	{
		Library book1 = new Library();   //creating object book1
		book1.insertLibrary();
		
		Library book2 = new Library();    //creating object book2
		book2.insertLibrary();
		
		Library book3 = new Library();     //creating object book3
		book3.insertLibrary();
		
		
		// displaying out 
		
		System.out.println();
		System.out.println("--------------------The Details of books in library---------------------");
		book1.display();
		System.out.println();
		book2.display();
		System.out.println();
		book3.display();
		System.out.println("---------------------xxxxxxxxxxxxxxxxxxxxxxx--------------------");	
	
	}// end of main method
	
}// end of class