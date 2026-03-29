class VegMenu
{
	public void getVegMenuDetails()
	{
		System.out.println("Getting Veg Menu Details");
	}
	public void checkVegFoodByFoodName(String foodName)
	{
		System.out.println("Checking Veg Food by Food Name");
		if(foodName=="Panneer Butter Masala")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Veg Biriyani")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Dal Tadka")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Palak Panneer")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Mixed Vegetable Curry")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Veg Pulao")
		{
			System.out.println("Food Available");
		}
		else if (foodName=="Sambar Rice")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Lemon Rice")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Curd Rice")
		{
			System.out.println("Food Available");
		}
		else if (foodName=="Bisibele Bath")
		{
			System.out.println("Food Available");
		}
		else
		{
			System.out.println("Foods Not Available");
		}
	}
	
	public double CheckVegFoodPriceByFoodName(String vegFoodName)
	{
		System.out.println ("Invoking CheckVegFoodPriceByFoodName:"+vegFoodName);
		
		double vegFoodPrice=0.0;
		if(vegFoodName=="Veg Biriyani")
		{
			vegFoodPrice=40.1;
		}
		else if(vegFoodName=="Shavge Uppitt")
		{
			vegFoodPrice=50.3;
		}
		else if(vegFoodName=="Bisibele Bath")
		{
			vegFoodPrice=30.2;
		}
		else if(vegFoodName=="Curd Rice")
		{
			vegFoodPrice=55.3;
		}
		else
		{
			System.out.println(vegFoodName + " is not available");
		}
		return vegFoodPrice;
	}
}