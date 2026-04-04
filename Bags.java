class Bags 
{

    Bags() 
	{
        this("School Bag");
        System.out.println("I am Bags Constructor 1");
    }

    Bags(String type) 
	{
        this("School Bag", "Skybags");
        System.out.println("I am Bags Constructor 2");
        System.out.println("Type: " + type);
    }

    Bags(String type, String brand) 
	{
        this("School Bag", 1200.5);
        System.out.println("I am Bags Constructor 3");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }

    Bags(String type, double price) 
	{
        this("School Bag", 4.6f);
        System.out.println("I am Bags Constructor 4");
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }

    Bags(String type, float rating) 
	{
        System.out.println("I am Bags Constructor 5");
        System.out.println("Type: " + type);
        System.out.println("Rating: " + rating);
    }
}

