package testpackage1;

public class Static1 
{
	public static void method()
	{
		System.out.println("static method");
	}
	public static void method (int x)
	{
		System.out.println("static method with int");
	}
	
	public void method(int x ,int y)
	{
		System.out.println("nonstatic method with int ");
	}
	public static void main(String[] args) 
	{
		method();
		method(1);
		
		Static1 d = new Static1();
		d.method(12, 11);
		
	}
}
