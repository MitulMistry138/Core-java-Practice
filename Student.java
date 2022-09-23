/*

*/

class Student
{
	private int rollNo;
	private String name;
	private float marks;
	
	Student()
	{
		
	}
	
	Student(int rollNo,String name,float marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
			
	}
	
	void setRollNO(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	int getRollNO()
	{
		return this.rollNo;
	}
	void setName(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return this.name;
	}
	void setMarks(float marks)
	{
		this.marks=marks;
	}
	
	float getMarks()
	{
		return this.marks;
	}
	
			
}