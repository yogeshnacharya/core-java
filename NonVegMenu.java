class NonVegMenu
{
	public void getNonVegMenuDetails()
	{
		System.out.println("Getting Non Veg Menu Details");
	}
	public void checkNonVegFoodByFoodName(String foodName)
	{
		System.out.println("Checking Non Veg Food by Food Name");
		if(foodName=="Butter Chicken")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Chicken Biriyani")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Mutton Curry")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Fish Curry")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Egg Curry")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Chicken Tikka")
		{
			System.out.println("Food Available");
		}
		else if (foodName=="Chicken Kabab")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Tandoori Chicken")
		{
			System.out.println("Food Available");
		}
		else if(foodName=="Prawn Masala")
		{
			System.out.println("Food Available");
		}
		else if (foodName=="Chicken Lollipop")
		{
			System.out.println("Food Available");
		}
		else
		{
			System.out.println("Foods Not Available");
		}
	}
	public double CheckNonVegFoodPriceByFoodName(String nonVegFoodName)
	{
		System.out.println ("Invoking CheckNonVegFoodPriceByFoodName:"+nonVegFoodName);
		
		double nonVegFoodPrice=0.0;
		if(nonVegFoodName=="Chicken Lollipop")
		{
			nonVegFoodPrice=40.1;
		}
		else if(nonVegFoodName=="Prawn Masala")
		{
			nonVegFoodPrice=50.3;
		}
		else if(nonVegFoodName=="Chicken Tikka")
		{
			nonVegFoodPrice=30.2;
		}
		else if(nonVegFoodName=="Egg Curry")
		{
			nonVegFoodPrice=55.3;
		}
		else
		{
			System.out.println(nonVegFoodName + " is not available");
		}
		return nonVegFoodPrice;
	}
}