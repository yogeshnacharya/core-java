class Headphones 
{
    String brand;
    String type;
    double price;
    String color;
    boolean noiseCancellation;
    int batteryLife;
	
	public Headphones(String brand,String type,double price,String color,boolean noiseCancellation,int batteryLife)
	{
		System.out.println("I am Headphones constructors with parameter:"+ brand);
		System.out.println("I am Headphones constructors with parameter:"+ type);
		System.out.println("I am Headphones constructors with parameter:"+ price);
		System.out.println("I am Headphones constructors with parameter:"+ color);
		System.out.println("I am Headphones constructors with parameter:"+ noiseCancellation);
		System.out.println("I am Headphones constructors with parameter:"+ batteryLife);
	}
	
	public Headphones()
	{
		System.out.println("I am Headphones Constructors without parameter");
	}
	
	public void getHeadPhonesDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Type:"+type);
		System.out.println("Price:"+price);
		System.out.println("Colour:"+color);
		System.out.println("Noise Cancellation:"+noiseCancellation);
		System.out.println("Battery Life:"+batteryLife);
	}

}