class Tv
{
    String brand;
    int size;
    double price;
    String type;
    boolean smartTV;
    int warranty;
	
	public Tv(String brand,int size,double price,String type,boolean smartTV,int warranty)
	{
		System.out.println("I am Tv constructors with parameter:"+ brand);
		System.out.println("I am Tv constructors with parameter:"+ size);
		System.out.println("I am Tv constructors with parameter:"+ price);
		System.out.println("I am Tv constructors with parameter:"+ type);
		System.out.println("I am Tv constructors with parameter:"+ smartTV);
		System.out.println("I am Tv constructors with parameter:"+ warranty);
	}
	
	public Tv()
	{
		System.out.println("I am Tv Constructors with no parameter");
	}
	
	public void getTvDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Size:"+size);
		System.out.println("Price:"+price);
		System.out.println("Type:"+type);
		System.out.println("Smart Tv:"+smartTV);
		System.out.println("Warranty:"+warranty);
	}
}