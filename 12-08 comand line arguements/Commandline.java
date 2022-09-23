/*
@Program for CommandLine 
@author : Mitul Mistry
@Date :12-08
*/

class CommandLine
{
	//calling main method 
	static public void main(String args[])
	{
		System.out.println("First name is :"+ args[0]); //passing multiple commaand line arguements 
		System.out.println("version :"+ System.getProperty("java.version"));
		System.out.println("Surname is :"+ args[1]);
        System.out.println(Integer.SIZE);	
	System.out.println(" Age is :"+ args[2]);
	}
	
}
		