package testpackage1;

public class Method1 
{
	// non static var
	public int b=100;
	public void method2()
	{
		System.out.println("non static");
	}
	
public int method(char x)
{
	int a=200;
	System.out.println(a);
	return 300 ;
}
public static void main(String[] args)

{
	Method1 x=new Method1(); 
	x.method('a');
	int k=x.method('a');
	System.out.println(k);
	System.out.println(k+100);
	System.out.println(k-200);
	
	//non static var
			Method1 d = new Method1();
			System.out.println(d.b);
			d.method2();
			

	
}

}
