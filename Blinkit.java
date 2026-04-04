class Blinkit
{
	Blinkit()
	{
		this("Milk");
		System.out.println("I am Blinkit Constructor 1");
	}

	Blinkit(String itemName)
	{
		this("Milk","Blinkit Store");
		System.out.println("I am Blinkit Constructor 2");
		System.out.println("Item Name:"+itemName);
	}

	Blinkit(String itemName,String storeName)
	{
		this("Milk",50.0);
		System.out.println("I am Blinkit Constructor 3");
		System.out.println("Item Name:"+itemName);
		System.out.println("Store Name:"+storeName);
	}

	Blinkit(String itemName,double price)
	{
		this("Milk",4.2f);
		System.out.println("I am Blinkit Constructor 4");
		System.out.println("Item Name:"+itemName);
		System.out.println("Price:"+price);
	}

	Blinkit(String itemName,float rating)
	{
		System.out.println("I am Blinkit Constructor 5");
		System.out.println("Item Name:"+itemName);
		System.out.println("Rating:"+rating);
	}
}