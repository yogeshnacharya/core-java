class Shoes
{
	static float shoePrice=1500.6f;
	static String shoeBrand="Nike";
	static int manufacturerYear=2016;
	
   public static void getShoeDetails()
   {
	   System.out.println("Shoe price:"+headPhonePrice);
   }
       public static String getShoeBrand()
	   {
           System.out.println("Shoe Brand:"+shoeBrand);
		   return  "shoeBrand";
	   }		   
	      public static String getShoeManufacturer(String manufacturer)
		  {
			  System.out.println("Shoe Manufacturer:"+manufacturer);
			  return "manufacturer";
		  }
		     public static void  getheadPhoneManufacturingYear()
			 {
				 System.out.println("HeadPhone Manufacturing Year:"+manufacturerYear);
			 }
		
}