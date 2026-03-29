class HeadPhone
{
	static float headPhonePrice=45000.6f;
	static String headPhoneBrand="one plus";
	static int manufacturerYear=2015;
	
   public static void getHeadPhoneDetails()
   {
	   System.out.println("HeadPhone price:"+headPhonePrice);
   }
       public static String getheadPhoneBrand()
	   {
           System.out.println("HeadPhone Brand:"+headPhoneBrand);
		   return  "headPhoneBrand";
	   }		   
	      public static String getheadPhoneManufacturer(String manufacturer)
		  {
			  System.out.println("Headphone Manufacturer:"+manufacturer);
			  return "manufacturer";
		  }
		     public static void  getheadPhoneManufacturingYear()
			 {
				 System.out.println("HeadPhone Manufacturing Year:"+manufacturerYear);
			 }
		
}