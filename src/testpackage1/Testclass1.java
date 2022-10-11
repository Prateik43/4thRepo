package testpackage1;

public class Testclass1 {
	public static void main(String[] args) 
	{
//		int a[]={2,3,4,5,6,7,9};
////		 0 1 2 3 4 5 6
//	int b[]=  new int [7];
//	 b[0]=a[0];
//	b[1]=a[1];
//	b[2]=a[2];
//	b[3]=a[3];
//	b[4]=a[4];
//	b[5]=a[5];
//	b[6]=a[6];
//	for(int i=0;i<=(b.length-1);i++)
//	{
//		System.out.println(b[i]);
//	}
//	}
//	
	int a[]={4,8,12,16,55,44};
//	 0,1,2,3,4, 5,6
//assume 
	int max =a[0];

for(int i=0;i<=(a.length-1);i++)
{
	if(a[i]>max)
	{
		max=a[i];	
	}
	
}
System.out.println("maximum number is-"+max);

}
}