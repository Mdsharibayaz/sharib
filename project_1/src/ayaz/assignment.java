package ayaz;

public class assignment 
{
	public int  sum (int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("result"+c);
		return c;
	}
    
	public int sub (int d,int e)
	{
		int f;
		f=d-e;
		System.out.println("result"+f);
		return f;
	}
	public int sum1 (int p,int q)
	{
		int r;
		r=p+q;
		System.out.println("result"+r);
		return r;
	}
	public int multi (int g,int h)
	{
		int i;
		i=g*h;
		System.out.println("result"+i);
		return i;
	}
	public void div (int j,int k)
	{
		int l;
		l=j/k;
		System.out.println("result"+l);
	}
	public static void main(String[] args)
	{
		assignment mno=new assignment();
		int sumresult=mno.sum(10,2);
		int subresult =mno.sub(sumresult,2);
		int sum1result=mno.sum(subresult,2);
		int multiresult =mno.multi(sum1result,2);
		mno.div(multiresult,2);
		
	}
	
	// assingment2
	
	
}
