class Bike 
{
    String brand;
    String model;
    double price;
    int mileage;
    String color;
    int engineCC;
	
	public Bike(String brand,String model,double price,int mileage,String color,int engineCC)
	{
		System.out.println("I am Bike constructors with parameter:"+ brand);
		System.out.println("I am Bike constructors with parameter:"+ model);
		System.out.println("I am Bike constructors with parameter:"+ price);
		System.out.println("I am Bike constructors with parameter:"+ mileage);
		System.out.println("I am Bike constructors with parameter:"+ color);
		System.out.println("I am Bike constructors with parameter:"+ engineCC);
	}
	
	public Bike()
	{
		System.out.println("I am Bike constructors without parameter");
	}
	
	public void getBikeDetails()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Mileage:"+mileage);
		System.out.println("Colour:"+color);
		System.out.println("Engine CC:"+engineCC);
	}

}
