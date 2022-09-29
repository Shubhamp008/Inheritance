package Containment;

class Dept
{
	int id;
	String name;
	Dept(){}
	Dept(int i,String b)
	{
		id=i;
		name=b;
	}
	
}

class Employee
{
	String name,dept;
	int  id,salary;
	Employee(){}
	Employee(String a,Dept d,int c)
	{
	
	name=a;
	dept=d.name;
	id=d.id;
	salary=c;
	
	}
	public String toString() 
	{
		return " ID: "+id+" Name :"+name+ "Department : "+dept+" Salary :"+salary;
	}
	
}

class Mydate
{
	private int dd,mm,yy;
	private String f;
	Mydate(){}
	Mydate(int a,int b,int c)
	{
		dd =a;
		mm=b;
		yy=c;
	}
	
	public void setData(int a,int b,int c) 
	{
		dd=a;
		mm=b;
		yy=c;
		f= a+" "+b+" "+c;
	}
	
	public String toString() {
		return f; 
	}
}

class  EmployeeDetails
{
	Employee ee;
	Mydate md;
	EmployeeDetails(Employee e,Mydate d)
	{
		ee=e;
		md=d;
		System.out.println("Employee Details are :"+ee+"Date is : "+md);
	}
	
}
      

public class ExtraContainment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d=new Dept(12112,"SOFTWARE DEVELOPEMENT");
		
		Employee e=new Employee("Shubham", d,48000);
		Mydate m= new Mydate();
		m.setData(9, 2,1997);
		
		EmployeeDetails ed= new EmployeeDetails(e,m);
	}

}
