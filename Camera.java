class Camera
 {
    String brand;
    String type;
    double price;
    int megapixels;
    boolean wifi;
    String color;
	
	public Camera(String brand,String type,double price,int megapixels,boolean wifi,String color)
	{
		System.out.println("I am Camera constructors with parameter:"+ brand);
		System.out.println("I am Camera constructors with parameter:"+ type);
		System.out.println("I am Camera constructors with parameter:"+ price);
		System.out.println("I am Camera constructors with parameter:"+ megapixels);
		System.out.println("I am Camera constructors with parameter:"+ wifi);
		System.out.println("I am Camera constructors with parameter:"+ color);
	}
	
	public Camera()
	{
		System.out.println("I am Camera Constructors without parameters");
	}
	
	public void getCameraDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Type:"+type);
		System.out.println("Price:"+price);
		System.out.println("Mega Pixels:"+megapixels);
		System.out.println("Wifi:"+wifi);
		System.out.println("Colour:"+color);
	}
}
