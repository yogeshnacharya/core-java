class CarRunner
{
	public static void main(String [] car)
	{
		Car caa=new Car("Toyota","Innova",2000000,7,"Diesel","White");
		Car ca=new Car();
		ca.brand = "Toyota";
		ca.model = "Innova";
		ca.price = 2000000;
		ca.seats = 7;
		ca.fuelType = "Diesel";
		ca.color = "White";
		
		ca.getCarDetails();
	}
}