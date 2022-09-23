/*

*/

class Banks
{
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.out.println);
		System.out.println("Enter the numbers ");
		

		int length=sc.nextInt();
		BankAccount b1[]=new BankAccount[length];
		
		for(int i=0;i<length;i++)
		{
			b1[i]=new BankAccount();
			System.out.println("Wnter Details of acc");
			b1[i].setaccountNumber(sc.nextInt());
            System.out.println("Wnter Details of acc");
			b1[i].setaccountName(sc.next());
            System.out.println("Wnter Details of acc");
			b1[i].setaccountBalance(sc.nextdouble());			
			
		}
		/* b1[0]=new BankAccount(1203," HI", 10000.0 );
		b1[1]=new BankAccount(1235,"hellp", 500.0 );
		b1[2]=new BankAccount(1389," hello", 100.0 ); */	
		
		for(int i=0;i<3;i++)
		{
			if((b1[i].getaccountBalance())<1000)
			{
				System.out.println("Account name" +b1[i].getaccountName());
			}
		}
		
		
	}
}