package testpackage1;

public class Static 
{

	int b = 60;
	
	public static void main(String[] args) 
	{
		int c=2;
		System.out.println(c);
		//case-I
		Static x = new Static();
		System.out.println(x.b);
		
		x.b = 120;
		System.out.println(x.b + 80);  //200
		
		//case-II
		Static y = new Static();
		System.out.println(y.b); //60
		
	}	

}
