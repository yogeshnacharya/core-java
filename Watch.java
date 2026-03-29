class Watch
{
	String brand;
    String type;
    double price;
    String color;
    boolean waterproof;
    int warranty;
	
	public Watch(String brand,String type,double price,String color,boolean waterproof,int warranty)
	{
		System.out.println("I am Watch constructors with parameter:"+ brand);
		System.out.println("I am Watch constructors with parameter:"+ type);
		System.out.println("I am Watch constructors with parameter:"+ price);
		System.out.println("I am Watch constructors with parameter:"+ color);
		System.out.println("I am Watch constructors with parameter:"+ waterproof);
		System.out.println("I am Watch constructors with parameter:"+ warranty);
	}
	
	public Watch()
	{
		System.out.println("I am Watch Constructors with no parameter");
	}
	
	public void getWatchDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Type:"+type);
		System.out.println("Price:"+price);
		System.out.println("Colour:"+color);
		System.out.println("Water Proof:"+waterproof);
		System.out.println("Warranty:"+warranty);
	}
}