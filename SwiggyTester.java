class SwiggyTester
{
	public static void main(String a[])
	{
	//invoking  a method
	// if we wont use void then -->String ref = Swiggy.takeOrder();
	 double itemPrice = Swiggy.takeOrder("mosaranna");

	 System.out.println("your order is ready with "   );
	 // if no void -->System.out.println("your order is ready with " +ref);
	}
}