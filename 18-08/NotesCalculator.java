/*
Program : Java Program to check the amount of notes to be given  
@author:  Mitul Mistry
@date :18 -08 -2022
*/

class NotesCalculator
{
	static void calcNotes(int amount)
	{
	    int note50=0,note20=0,note10=0,note5=0,note2=0,note1=0;
		
	 while(amount>0)    //we have given while loop to repeat the value till the amount reaches 0
	 { 		 
	    if(amount>=50)   // if the given amount is greater than 50 it will print the notes 
		{
			note50++;
			amount-=50;
		}
            else if(amount>=20)  //after getting clear from amount 50 ,if the mout is smaller than 50 it will come in 	this loop and check the amount and print the value of notes required			
		     {
			  note20++;
			  amount-=20;
		      }
                else if(amount>=10)
		        {
			      note10++;
			      amount-=10;
		        }
                    else if(amount>=5)
		            {
			           note5++;
			           amount-=5;
		            }
					     else if(amount>=2)
		                {
			               note2++;
			               amount-=2;
		                }
						else if(amount>=1)
                        {
							note1++;
							amount-=1;
						}
                          else
                            System.out.println("Wrong input");							  
	 
	}
	
                System.out.println("rs 50 notes"+ note50);
				System.out.println("rs 20 notes"+ note20);
				System.out.println("rs 10 notes"+ note10);
				System.out.println("rs 5 notes"+ note5);
				System.out.println("rs 2 notes"+ note2);
				System.out.println("rs 1 notes"+ note1);
				
	}			
	public static void main(String args[])
	{
	
        int total= Integer.parseInt(args[0]);
           calcNotes(total);		
	
	}
	
		
	
}
	