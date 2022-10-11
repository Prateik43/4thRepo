package testpackage1;

public class Stringpractice
{
	public static void main(String[] args)
	{
		
	
	//there are two ways we can write String
		//*It is non-primitive datatype
	//1.String literal
	//ex.
	String a="Pratik";
	System.out.println(a);
	//2.With a new keyword
	String b= new String("Pratik1");
	System.out.println(b);
	//Special char #String allows alpha-numeric values
	String c="!@#$%";
	System.out.println(c);
	
	//value checking
	//equals method
	String v = "Apple";
	System.out.println(v);
	
	String s = "Mango";
	System.out.println(s);
	//.equals---->value check	
	boolean result = v.equals(s);
	System.out.println(result);
	String q = "Apple";
	String w = "Mango";
	String e = "Apple";
	String d = "apple";
	
	//address check
	System.out.println(q.equals(w)); //F
	System.out.println(q.equals(e)); //T
	System.out.println(q.equals(d)); //F

	//== operator---->address check	
	boolean result1 = v == s;
	System.out.println(result1);
	String n = "Apple";
	String m = "Mango";
	String o = "Apple";
	String p = "apple";
	
	//address check
	System.out.println(n==m); //F
	System.out.println(n==o); //T
	System.out.println(n==p); //F
	
	//String Methods
	//1.String Length
	String k = "Apple";
	System.out.println(k.length());
	System.out.println("Length is"+ k.length());
	//2.charAt 
	System.out.println(k.charAt(0));//here we take 0 bcoz we have to print char at 0
	System.out.println(k.charAt(1));//here we get Char at 1 is p
	//here we can loop statement bcoz we dont write again and again Statements

	for(int i=0; i<d.length();i++)
	{
		System.out.println(k.charAt(i));
	}
	

	//3.Concatenation method
	//String_Name.concat("string");
	//here we are going to use + operator for conCat two statements
	String i = "Pratik";
	String j = "Tadalge";
	String resultCOncat = i.concat(j);
	System.out.println(resultCOncat);
	//OR 2nd way
	System.out.println(i+j);

	//4.Uppercase
	//String_name.toUpperCase();
	System.out.println(i.toUpperCase());
	
	//5.LowerCase
	//String_name.toLowerCase();
	System.out.println(j.toLowerCase());
	
	//6.StartsWith
	//String_name.startsWith(); its value in boolean type i.e T/F
	System.out.println(i.startsWith("Pra"));//T
	System.out.println(i.startsWith("tik"));//F
	System.out.println(i.startsWith("P"));//T
	
	//7.EndsWith
	//String_name.endsWith(); its value in boolean type i.e T/F
	System.out.println(i.endsWith("Pra"));//F
	System.out.println(i.endsWith("tik"));//T
	System.out.println(i.endsWith("k"));//T
	
	//8.Equals 
	//in this equals is compared with the info is same but the info is weather
	//in uppercase or lowercase
	String l = "Rahul";
	
	String z = "rahul";
	
	//value check??
	System.out.println(l.equals(z)); //F
	
	//9.equalsIgnore
	//same info but in upper or lower doesn't matter here
	System.out.println(l.equalsIgnoreCase(z));//T

	//10.substrinng(Start index)
	//in this subs means negelectinng letters that we have to
	//in below Ex. in subsstring we written 4 so it neglects 1st four letters
	String h="Pratik";
	System.out.println(h.substring(4));
	
	
	//11.substrinng(Start index,end index)
	//start index and end index pass
	//always pass one extra ending index 5 + 1
	String g= "RAHULKUMAR";
	System.out.println(g);
	System.out.println(g.length());
	System.out.println(g.substring(2, 5));
	
	//12.trim
	String f="rahulkumar";
			System.out.println(f);
	System.out.println(f.length());
	String x = g.trim();
	System.out.println(x);
	System.out.println(x.length());
	System.out.println(f);
	System.out.println(c.length());
	


	
	
	


	}
}
