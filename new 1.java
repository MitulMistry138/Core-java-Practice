/*

*/

class Banks
{
	public static void main(String ...args)
	{
		BankAccount b1[]=new BankAccount[3];
		
		b1[0]=new BankAccount(1203," HI", 10000.0 );
		b1[1]=new BankAccount(1235,"hellp", 500.0 );
		b1[2]=new BankAccount(1389," hello", 100.0 );	
		
		for(int i=0;i<3;i++)
		{
			if((b1[i].getAccountBalance)<1000)
			{
				System.out.println("Account name" +b1[i].getAccountName);
			}
		}
		
		
	}
}