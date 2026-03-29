class Refrigerator 
{
    String brand;
    int capacity;
    double price;
    String type;
    boolean inverter;
    int warranty;
	
	public Refrigerator(String brand,int capacity,double price,String type,boolean inverter,int warranty)
	{
		System.out.println("I am Refrigerator constructors with parameter:"+ brand);
		System.out.println("I am Refrigerator constructors with parameter:"+ capacity);
		System.out.println("I am Refrigerator constructors with parameter:"+ price);
		System.out.println("I am Refrigerator constructors with parameter:"+ type);
		System.out.println("I am Refrigerator constructors with parameter:"+ inverter);
		System.out.println("I am Refrigerator constructors with parameter:"+ warranty);
	}
	
	public Refrigerator()
	{
		System.out.println("I am Refrigerator Constructors with no parameter");
	}
	
	public void getFridgeDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Capacity:"+capacity);
		System.out.println("Price:"+price);
		System.out.println("Type:"+type);
		System.out.println("Inverter:"+inverter);
		System.out.println("Warranty:"+warranty);
	}
}