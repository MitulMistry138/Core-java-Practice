/*
Program:- Phone charging Demo
@author: Mitul V mistry
@date: 13-09-2022
*/

class BreakContinueDemo
{
  static void printNumbers()
  {
	for(int i=1;i<=10;i++)
	{
		if(i==5)
		{
			break;
		}
		System.out.println(i);
	}
  
  }
  
  static void printNumber1()
  {
	for(int i=1;i<=10;i++)
	{
		if(i==5)
		{
			continue;
		}
		System.out.println(i);
	}
  
  }
  
   static void printNumber2()
  {
	for(int i=1;i<=3;i++)
	{
		System.out.println();
		for (int j=1;j<=3;j++)
		{
		   if(i<=j)
				break;
			System.out.print(i+""+j+ " ");
		}
	}
  }  
  static void printNumbers3() // labeled break and continue
   {
	  outerLoop: for(int i=1;i<=3;i++)
	   {
		   System.out.println();
		   for(int j=1;j<=3;j++)
		   {
			   if(i==j)
				continue outerLoop;
			   System.out.print(i+""+j+ "  ");
		   }
	   }
	   
	   
   }
public static void main(String ...args)
{
      System.out.println("Continue statement");
	  printNumber2();
	 // System.out.println("Continue statement with labeled block");
	 // printNumbers3();

}
}