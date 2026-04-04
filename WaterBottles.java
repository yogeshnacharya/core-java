class WaterBottles 
{

    WaterBottles() 
	{
        this("Plastic Bottle");
        System.out.println("I am WaterBottle Constructor 1");
    }

    WaterBottles(String type) 
	{
        this("Plastic Bottle", "Milton");
        System.out.println("I am WaterBottle Constructor 2");
        System.out.println("Type: " + type);
    }

    WaterBottles(String type, String brand) 
	{
        this("Plastic Bottle", 300.5);
        System.out.println("I am WaterBottle Constructor 3");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }

    WaterBottles(String type, double price) 
	{
        this("Plastic Bottle", 4.3f);
        System.out.println("I am WaterBottle Constructor 4");
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }

    WaterBottles(String type, float rating) 
	{
        System.out.println("I am WaterBottle Constructor 5");
        System.out.println("Type: " + type);
        System.out.println("Rating: " + rating);
    }
}

