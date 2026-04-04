class Zepto
{
	Zepto()
	{
		this("Groceries");
		System.out.println("I am Zepto Constructor 1");
	}

	Zepto(String category)
	{
		this("Groceries","Zepto Store");
		System.out.println("I am Zepto Constructor 2");
		System.out.println("Category:"+category);
	}

	Zepto(String category,String storeName)
	{
		this("Groceries",200.0);
		System.out.println("I am Zepto Constructor 3");
		System.out.println("Category:"+category);
		System.out.println("Store Name:"+storeName);
	}

	Zepto(String category,double bill)
	{
		this("Groceries",4.1f);
		System.out.println("I am Zepto Constructor 4");
		System.out.println("Category:"+category);
		System.out.println("Bill:"+bill);
	}

	Zepto(String category,float rating)
	{
		System.out.println("I am Zepto Constructor 5");
		System.out.println("Category:"+category);
		System.out.println("Rating:"+rating);
	}
}