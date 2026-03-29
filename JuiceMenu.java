class JuiceMenu
{
	public void JuiceMenuDetails()
	{
		System.out.println("Getting Juice Menu Details");
	}
	public void checkJuiceByJuiceName(String juiceName)
	{
		System.out.println("Checking Juice By Juice Name");
		if(juiceName=="Apple Juice")
		{
			System.out.println("Juice Available");
		}
		else if(juiceName=="Banana Juice")
		{
			System.out.println("Juice Available");
		}
		else if(juiceName=="Chickoo Juice")
		{
			System.out.println("Juice Available");
		}
		else if(juiceName=="Oreo Juice")
		{
			System.out.println("Juice Available");
		}
		else if(juiceName=="Pineapple Juice")
		{
			System.out.println("Juice Available");
		}
		else if(juiceName=="Strawberry Juice")
		{
			System.out.println("Juice Available");
		}
		else if (juiceName=="Mango Juice")
		{
			System.out.println("Juice Available");
		}
		else if(juiceName=="Orange Juice")
		{
			System.out.println("Juice Available");
		}
		else if(juiceName=="Grapes Juice")
		{
			System.out.println("Juice Available");
		}
		else if (juiceName=="Butter Scotch")
		{
			System.out.println("Juice Available");
		}
		else
		{
			System.out.println("Juice Not Available");
		}
	}
	public double CheckJuicePriceByJuiceName(String juiceName)
	{
		System.out.println ("Invoking CheckJuicePriceByJuiceName:"+juiceName);
		
		double juicePrice=0.0;
		if(juiceName=="Apple Juice")
		{
			juicePrice=40.1;
		}
		else if(juiceName=="Mango Juice")
		{
			juicePrice=50.3;
		}
		else if(juiceName=="Orange Juice")
		{
			juicePrice=30.2;
		}
		else if(juiceName=="Oreo Juice")
		{
			juicePrice=55.3;
		}
		else
		{
			System.out.println(juiceName + " is not available");
		}
		return juicePrice;
	}
}