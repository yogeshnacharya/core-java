class Tablet 
{
    String brand;
    String model;
    double price;
    int storage;
    String color;
    boolean supportsPen;
	
	public Tablet(String brand,String model,double price,int storage,String color,boolean supportsPen)
	{
		System.out.println("I am Tablet constructors with parameter:"+ brand);
		System.out.println("I am Tablet constructors with parameter:"+ model);
		System.out.println("I am Tablet constructors with parameter:"+ price);
		System.out.println("I am Tablet constructors with parameter:"+ storage);
		System.out.println("I am Tablet constructors with parameter:"+ color);
		System.out.println("I am Tablet constructors with parameter:"+ supportsPen);
	}
	
	public Tablet()
	{
		System.out.println("I am Laptop Constructors with no parameter");
	}
	
	public void getTabletDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Storage:"+storage);
		System.out.println("Colour:"+color);
		System.out.println("Supports Pen:"+supportsPen);
	}
}