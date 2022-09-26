class SwapThreeNumbers
{
	public static void main(String args[])
	{
	int a = 25;
	int b = 15;
	System.out.println("Before swaping");
	System.out.println("a is " + a);
	System.out.println("b is " +  b);
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("After swaping");
	System.out.println("a is " + a);
	System.out.println("b is " +  b);
	}
}