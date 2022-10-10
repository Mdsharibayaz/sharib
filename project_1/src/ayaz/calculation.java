package ayaz;

public class calculation 
{ 
	public int sum (int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("result is"+c);
		return c;
	}
	public int sub (int a1,int a2)
	{
		int a3;
		a3=a1-a2;
	    System.out.println("result is"+a3);
		return a3;
	}
	public int multi(int s,int r)
	{
		int t;
		t=s*r;
		System.out.println("result is"+t);
		return t;
	}
	public void div (int p,int q)
	{
		int g;
	g=p/q;
	System.out.println("result is"+g);
	}
	public static void main(String[] args)
	{
		calculation obj=new calculation();
	    int sumresult=obj.sum(10,2);
		int subresult=obj.sub(8,2);
		int multiresult=obj.multi(12,6);
		obj.div(sumresult,subresult);

	
System.out.println("\n assingnment2\n");
	
// assignment2
		calculation zxv=new calculation();
		int multiresult1=zxv.multi(10,2);
		int subresult2=zxv.sub(multiresult1,2);
		int sumresult3=zxv.sum(subresult2,2);
		int subresult4=zxv.sub(sumresult3,2);
		zxv.div(subresult4,2);
	
	}

		
	}


