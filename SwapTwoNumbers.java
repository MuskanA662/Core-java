class SwapTwoNumbers
{
	public static void main(String args[])
	{
	  int a = 10;
	  int b = 15;
	  System.out.println("Before swap");
	  System.out.println("a is " + a);
	  System.out.println("b is " + b);
	  int temp = a;
	  a = b;
	  b = temp;
	  System.out.println("After swap");
	  System.out.println("a is " + a);
	  System.out.println("b is " + b);
	}
}