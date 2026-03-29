class Mobile
{
	String brand;
    String model;
    double price;
    int battery;
    String color;
    boolean is5G;
	
	public Mobile(String brand,String model,double price,int battery,String color,boolean is5G)
	{
		System.out.println("I am Mobile constructors with parameter:"+ brand);
		System.out.println("I am Mobile constructors with parameter:"+ model);
		System.out.println("I am Mobile constructors with parameter:"+ price);
		System.out.println("I am Mobile constructors with parameter:"+ battery);
		System.out.println("I am Mobile constructors with parameter:"+ color);
		System.out.println("I am Mobile constructors with parameter:"+ is5G);
	}
	
	public Mobile()
	{
		System.out.println("I am Mobile Constructors without parameter");
	}
	
	public void getMobileDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Battery:"+battery);
		System.out.println("Colour:"+color);
		System.out.println("Is 5G:"+is5G);
	}
}