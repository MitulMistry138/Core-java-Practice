/*Program :- Palindrome
3456:- is not Palindrome
3443 :- Palindrome
@author:- Mitul Mistry
@date - 13-Sep-2022 
*/

class Palindrome   // declaring class name as Palindrome 
{
	static void checkPalindrome(int number)   //using  
	{
		int remainder =0;
		int reversedNumber =0; // number used to store reversed number
		int temp =number;      // original number is stored in temp
		
		while(number>0)
		{
			remainder =number%10;
			reversedNumber= (reversedNumber*10)+remainder;
			number= number/10;
			
		}
				
			if(temp==reversedNumber)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("nit palindrome ");	
			}	
	}
	
public static void main(String ...args)  // command line arguement
 {
	int num =Integer.parseInt(args[0]);
	checkPalindrome(num);
 }
	
}// end of class
