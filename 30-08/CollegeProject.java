



import static java.lang.System.*;
class CollegeProject
{
	int p_id;
	String projectName;
   String subject;
    float marks;
    boolean status;
	
	CollegeProject()
	{
		out.println("No arguement contructor");

			projectName="null";
			subject="Computer";
			marks=1.0f;
					
	}
	
	
	/// Parameterized constructor 1 
	
CollegeProject(int p_id,String projectName,String subject, float marks,boolean status)
{
	out.println("Parametrize constructor 1");
	this.p_id=p_id;
	this.projectName=projectName;
	this.subject=subject;
	this.marks=marks;
	this.status=status;
	
} 
/// Parameterized constructor 2 
	


/// Parameterized constructor 2 



/// Parameterized constructor 2 


/// Parameterized constructor 2 

CollegeProject(int p_id,String projectName, float marks,boolean status)
{
	out.println("Parametrize constructor 5");
	
	this.p_id=p_id;
	this.projectName=projectName;
	this.subject="ASP.net";
	this.marks=marks;
	this.status=status;
	
} 


	void printStatus()
	{
		if(status)
		{
		out.println("Project id: " +p_id);
		out.println("Project name " +projectName);
		out.println("Project subject " +subject);
		out.println("Project marks " +marks);
		out.println("Project approval status " +status);
		}
		else
		{
			out.println("Project is not approved");
		}
	}		

}


class ProjectTest
{
	
	public static void main(String ...args)
	
	{
		CollegeProject stud1 = new CollegeProject(); // no args constructor 
		CollegeProject stud2= new CollegeProject(100,"Student System","ASp.net",76.5f,true); // no args constructor 
		CollegeProject stud3= new CollegeProject(101,"Library System",30.5f,false); // no args constructor 
		CollegeProject stud4= new CollegeProject(98,"Game ","VS",76.5f,true); // no args constructor 
		CollegeProject stud5= new CollegeProject(150,"Bank System","ASp.net",76.5f,true); // no args constructor 
		
		out.println();
		stud1.printStatus();
		
		out.println();
		stud2.printStatus();
		
		out.println();
		stud3.printStatus();
		
		out.println();
		stud4.printStatus();
		
		out.println();
		stud5.printStatus();
		
		
		
	}
	
	
	
	
	
	
	
}

