class Switches 
{

    Switches() 
	{
        this("Electrical Switch");
        System.out.println("I am Switch Constructor 1");
    }

    Switches(String type)
	{
        this("Electrical Switch", "Anchor");
        System.out.println("I am Switch Constructor 2");
        System.out.println("Type: " + type);
    }

    Switches(String type, String brand) 
	{
        this("Electrical Switch", 250.5);
        System.out.println("I am Switch Constructor 3");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }

    Switches(String type, double price) 
	{
        this("Electrical Switch", 4.2f);
        System.out.println("I am Switch Constructor 4");
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }

    Switches(String type, float rating) 
	{
        System.out.println("I am Switch Constructor 5");
        System.out.println("Type: " + type);
        System.out.println("Rating: " + rating);
    }
}

