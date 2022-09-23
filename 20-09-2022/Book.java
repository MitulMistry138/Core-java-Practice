/*
Program : to Create a Library using object and class(implicit)
@author : Mitul.V.Mistry
@date   : 20-09-2022
*/

class Library
{

//declaring properties

private String bookName;
private int bookSerialNumber;
private String bookAuthor;
private double bookPrice;

//method to insert book
void insertBook(String bookName,int bookSerialNumber,String bookAuthor, double bookPrice)
{
 this.bookName = bookName;
 this.bookSerialNumber = bookSerialNumber;
 this.bookAuthor = bookAuthor;
 this.bookPrice = bookPrice;

}

//method to display book
void displayBook()
{
System.out.println("Book Name :"+ this.bookName+"   "+ "BookSerialNumber :"+ this.bookSerialNumber+ "  "+"BookAuthor : "+ this.bookAuthor+ "  "+"BookPrice : "+ this.bookPrice);
}
}//end class

//declaring class book
class Book
{

//main method
public static void main(String[]args)

{

//Creating movie objects
Library book1= new Library();
book1.insertBook("Good Vibes Good Lifes", 2343, "Vex king", 400);

Library book2= new Library();
book2.insertBook("Wings Of Fire",3445, "Apj",500 );

Library book3= new Library();
book3.insertBook("One Day" ,34454, " Life will Change", 700);


//display all the book
book1.displayBook();
book2.displayBook();
book3.displayBook();


}

}


