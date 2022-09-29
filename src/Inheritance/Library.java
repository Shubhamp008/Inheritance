package Inheritance;
class Book
{
	private String name;
	Book(){}
	
	Book(String n)
	{
		name=n;
	}
	
	
	public void readBook(String n) 
	{
		this.name=n;
		
	}
	
	void display()
	{
		System.out.println("i was reading book of  : "+ name);
	}
	

}

class TextBook extends Book
{
	private String tname;
	TextBook(){}
	TextBook(String n)
	{
		super("english");
		tname=n;
	}
	
	
	void display()
	{
		super.display();
		System.out.println(" BUT NOW IM reading book of : "+tname+" Subjects");
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book b1=new TextBook("MATHS");
		b1.display();
		
	////book readbook(Stringbookname)  void display     override into textbook  "im reading textbook of --- subject"     library main  call overriden method
	}

}
