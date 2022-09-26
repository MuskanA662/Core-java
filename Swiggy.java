class Swiggy
{
 //Pizza,Burger,Sandwitch,mosaranna,FrenchFRies,SouthIndian,Pastries
 //Using String -->public static String takeOrder(){
	public  static double takeOrder( String item)
	{
	  if(item == "Pizza")
		{
		System.out.println("Thank you for ordering"+item);
		return 99.00 *quantity;
		}
			if(item == "Burger")
			{
			System.out.println("Thank you for ordering"+item);
			return 59.00*quantity;
			}
				if(item == "Sandwitch")
				{	
				System.out.println("Thank you for ordering"+item);
				return 49.00*quantity;
				}
					if(item == "mosaranna")
					{
					System.out.println("Thank you for ordering"+item);
					return 39.00*quantity;
					}
						if(item == "FrenchFRies")
						{
						System.out.println("Thank you for ordering"+item);
						return 79.00*quantity;
						}
							if(item == "SouthIndian")
							{
							System.out.println("Thank you for ordering"+item);
							return 439.00*quantity;
							}
 
								if(item == "Pastries")
								{
								System.out.println(" Your Oredr is ready Thank you for ordering " + item);
								return 59.00*quantity;
								}
		return 0.00;
		//other statements--cant write
 
	}
	public static double takeOrder(String item , int quantity){
		if(item == "Prize"){
			System.out.println("mosaranna ", 39);
			System.out.println("Your Final ordre is ready enjoy....");
		}
	}
		}
	}

}