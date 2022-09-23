/*
Program : input values from user
@author:  Mitul Mistry
@date :23-08-2022
*/
import java.util.Scanner;
class AddMultiArray
{
    
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name :");
	String name = sc.nextLine();
	System.out.println("Enter your age:");
    int age= sc.nextInt();
	System.out.println("Enter your gender:");
  char gender= sc.next().charAt(0);
  
   	System.out.println("Enter ");
	int []arr= new int[10];
	for(int i:arr)
	{
		i=sc.nextInt();
	}
}
}