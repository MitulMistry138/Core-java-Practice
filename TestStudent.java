class TestStudent
{
	// main method
 public static void main(String ...args)
 {
	
	 
	Student s[]= new Student[5];            // creating new array 
	
	// giving values
	    s[0]= new Student(1,"XYZ",50);
		s[1]= new Student(10,"Mitul",45);
		s[2]= new Student(30,"Pyro",91);
		s[3]= new Student(31,"Simbha",40);
		s[4]= new Student(55,"Guru",95);
	 
	 // to diplay the s 
	 for (int i=0;i<5;i++)
	  {
		if((s[i].getMarks())>90.00)
		{
			System.out.println("Name "+s[i].getName());
		}
		
	  } 
			 	  	
 }
// end of main 
}// end of main 