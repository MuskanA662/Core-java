class VesselTester{


 public static void main(String v[])
	{
	 //We are not initializing any value directly instead we have 
	 //setter and getter
	 Vessel.setvesselId(5789) ;
	 Vessel.setVesselName("plate") ;
	 Vessel.setVesselBrand("Muskan") ;
	 Vessel.setVesselPrice(500.00) ;
	
	 
	  //setter and getter
	  //variable can be chnge bt not type 
	System.out.println(Vessel.getVesselId());
	System.out.println(Vessel.getVesselName());
	System.out.println(Vessel.getVesselBrand());
	System.out.println(Vessel.getVesselPrice());
	}
}