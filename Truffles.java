class Truffles
{
 public static void main (String a[])
 {
	
	String type = "Cafe";
	String address = "MG Road";
	String managerNames[] ={ "Annakarmel","Sunnyleon","Sangeeta","Ganesha","Muskan"};
	int noOfManagers = 2;
	String foodMenu[] = {"Biryani","Pulav","Tandoori chiken","Khima","Egg rice","Fish Fry","Chiken lolipop","Lassi","Butter Milk","Ice cream","Milkshake","Sandwitch","Roti","Gobi Manchuri","Aaloo Paratha"};
    System.out.println("Welcome to VivantaTaj " +type);
	System.out.println("Address is near " +address);
	System.out.println("Number of Managers  are "+ noOfManagers);
	
	System.out.println("\nList of managerNames");
	System.out.println("Length of managerNames is "+managerNames.length);
	for (int m = 0; m < managerNames.length; m++){
	  System.out.println(managerNames[m] + " ");
	  }
	  
	System.out.println("\nList of foodMenu");
	System.out.println("Length of foodMenu is "+foodMenu.length);
	for (int m = 0; m < foodMenu.length; m++){
	  System.out.println(foodMenu[m] + " ");
	  }
	
	
 }


}