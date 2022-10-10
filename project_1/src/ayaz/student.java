package ayaz;

public class student
{
public void student() 
{
	this.student3();
	System.out.println("default constructor");
	this.student2();
}
public void student1() 
{
	System.out.println("one parameterized constructor");
}
public void student2() 
{
	this.student1();
	System.out.println("two parameterized constructor");
	this.student4();
}
public void student3()
{
	
	System.out.println("three parameterized contructor");
}
 public void student4()
 {System.out.println("four parameterized constructor");
 }
public static void main(String[] args)
{
student sha=new student();
sha.student();
}

}
