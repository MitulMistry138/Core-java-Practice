/*
Program:- Bank Details who have 1000 
@author:- Mitul Mistry
@date  :- 23-09-2022
*/

class BankAccount
{
	//declaring instance variable
	
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	//default constructor no arg constructor
    BankAccount()
	{
		
	}
	
	//parameterized constructor
	BankAccount(int accountNumber,String accountName,double accountBalance)
	{
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.accountBalance=accountBalance;
		
	}
	
	//getter setter method	
	void setaccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	int getccountNumber()
	{
		return this.accountNumber;
	}
	void setaccountName(String accountName)
	{
		this.accountName=accountName;
	}
	String getaccountName()
	{
		return this.accountName;
	}
	void setaccountBalance(double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	double getaccountBalance()
	{
		return this.accountBalance;
	}
	
}