class IceCreamMenu
{
	public void IceCreamMenuDetails()
	{
		System.out.println("Getting IceCream Menu Details");
	}
	public void checkIceCreamByIceCreamName(String iceCreamName)
	{
		System.out.println("Checking IceCream By IceCream Name");
		if(iceCreamName=="Apple Flavour IceCream")
		{
			System.out.println("IceCream Available");
		}
		else if(iceCreamName=="Cup Ice")
		{
			System.out.println("IceCream Available");
		}
		else if(iceCreamName=="Butter Scotch IceCream")
		{
			System.out.println("IceCream Available");
		}
		else if(iceCreamName=="Oreo IceCream")
		{
			System.out.println("IceCream Available");
		}
		else if(iceCreamName=="Strawberry IceCream")
		{
			System.out.println("IceCream Available");
		}
		else if(iceCreamName=="Cone IceCream")
		{
			System.out.println("Juice Available");
		}
		else if (iceCreamName=="Mango Flavour IceCream")
		{
			System.out.println("IceCream Available");
		}
		else if(iceCreamName=="Orange Flavour IceCream")
		{
			System.out.println("IceCream Available");
		}
		else if(iceCreamName=="ChocoBar")
		{
			System.out.println("IceCream Available");
		}
		else if (iceCreamName=="Butter Scotch IceCream")
		{
			System.out.println("IceCream Available");
		}
		else
		{
			System.out.println("IceCream Not Available");
		}
	}
	public double CheckIceCreamPriceByIceCreamName(String iceCreamName)
	{
		System.out.println ("Invoking CheckIceCreamPriceByIceCreamName:"+iceCreamName);
		
		double iceCreamPrice=0.0;
		if(iceCreamName=="Butter Scotch IceCream")
		{
			iceCreamPrice=40.1;
		}
		else if(iceCreamName=="Choco Bar")
		{
			iceCreamPrice=50.3;
		}
		else if(iceCreamName=="Oreo IceCream")
		{
			iceCreamPrice=30.2;
		}
		else if(iceCreamName=="Cup Ice")
		{
			iceCreamPrice=55.3;
		}
		else
		{
			System.out.println(iceCreamName + " is not available");
		}
		return iceCreamPrice;
	}
}