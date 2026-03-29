class Car
{
	String brand;
    String model;
    double price;
    int seats;
    String fuelType;
    String color;
	
	public Car(String brand,String model,double price,int seats,String fuelType,String color)
	{
		System.out.println("I am Car constructors with parameter:"+ brand);
		System.out.println("I am Car constructors with parameter:"+ model);
		System.out.println("I am Car constructors with parameter:"+ price);
		System.out.println("I am Car constructors with parameter:"+ seats);
		System.out.println("I am Car constructors with parameter:"+ fuelType);
		System.out.println("I am Car constructors with parameter:"+ color);
	}
	
	public Car()
	{
		System.out.println("I am Car Constructors without parameter");
	}
	public void getCarDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Seats:"+seats);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Colour:"+color);
	}
}