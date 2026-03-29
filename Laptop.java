class Laptop
{
	String brand;
    String processor;
    double price;
    int ram;
    int storage;
    String os;
	
	public Laptop(String brand,String processor,double price,int ram,int storage,String os)
	{
		System.out.println("I am Laptop constructors with parameter:"+ brand);
		System.out.println("I am Laptop constructors with parameter:"+ processor);
		System.out.println("I am Laptop constructors with parameter:"+ price);
		System.out.println("I am Laptop constructors with parameter:"+ ram);
		System.out.println("I am Laptop constructors with parameter:"+ storage);
		System.out.println("I am Laptop constructors with parameter:"+ os);
	}
	
	public Laptop()
	{
		System.out.println("I am Laptop Constructors without parameter");
	}
	
	public void getLaptopDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Processor:"+processor);
		System.out.println("Price:"+price);
		System.out.println("RAM:"+ram);
		System.out.println("Storage:"+storage);
		System.out.println("OS:"+os);
	}
}