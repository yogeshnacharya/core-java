class IceCreamMenuRunner
{
	public static void main(String [] icecream)
	{
		IceCreamMenu ref=new IceCreamMenu();
		ref.IceCreamMenuDetails();
		
		IceCreamMenu arun=new IceCreamMenu();
		arun.checkIceCreamByIceCreamName("Apple Flavour IceCream");
		arun.checkIceCreamByIceCreamName("Mango Flavour IceCream");
		arun.checkIceCreamByIceCreamName("Oreo IceCream");
		arun.checkIceCreamByIceCreamName("Orange Flavour IceCream");
		
		IceCreamMenu blossom=new IceCreamMenu();
		blossom.checkIceCreamByIceCreamName("Cup IceCream");
		blossom.checkIceCreamByIceCreamName("Cone IceCream");
		blossom.checkIceCreamByIceCreamName("Family Pack IceCream");
		blossom.checkIceCreamByIceCreamName("Butter Scotch IceCream");
		
		IceCreamMenu ibaco=new IceCreamMenu();
		ibaco.checkIceCreamByIceCreamName("Orange Flavour IceCream");
		ibaco.checkIceCreamByIceCreamName("Strawberry Flavour IceCream");
		ibaco.checkIceCreamByIceCreamName("Choco Bar IceCream");
		ibaco.checkIceCreamByIceCreamName("Cup IceCream");
		
		IceCreamMenu delight=new IceCreamMenu();
		delight.checkIceCreamByIceCreamName("Candy IceCream");
		delight.checkIceCreamByIceCreamName("Cone IceCream");
		delight.checkIceCreamByIceCreamName("Cup Ice");
		delight.checkIceCreamByIceCreamName("Butter Scotch IceCream");
		
		IceCreamMenu unique=new IceCreamMenu();
		unique.checkIceCreamByIceCreamName("Strawberry Flavour IceCream");
		unique.checkIceCreamByIceCreamName("Mango Flavour IceCream");
		unique.checkIceCreamByIceCreamName("Orange Flavour IceCream");
		unique.checkIceCreamByIceCreamName("Grapes Flavour IceCream");
		double price=unique.CheckIceCreamPriceByIceCreamName("Strawberry Flavour IceCreams");
		System.out.println("The Price is:"+price);
		double price1=unique.CheckIceCreamPriceByIceCreamName("Oreo IceCream");
		System.out.println("The Price is:"+price1);
		double price2=unique.CheckIceCreamPriceByIceCreamName("Cup Ice");
		System.out.println("The Price is:"+price2);
		double price3=unique.CheckIceCreamPriceByIceCreamName("Butter Scotch IceCream");
		System.out.println("The Price is:"+price3);
		
	}
}