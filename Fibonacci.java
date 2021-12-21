package college;

public class Fibonacci {
	public static void main (String[] args) 
	{ 
		int i = m(5);
		System.out.println("m is " + i);
	}
	public static int m (int n)
	{
		if (n<1)
			return 1;
		else
			return (m(n-2)+1+m(n-3));
	}
}