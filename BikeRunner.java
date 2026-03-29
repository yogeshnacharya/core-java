class BikeRunner
{
	public static void main(String [] bike)
	{
		Bike bik=new Bike("Yamaha","R15",180000,40,"Red",155);
		Bike bi=new Bike();
		bi.brand = "Yamaha";
		bi.model = "R15";
		bi.price = 180000;
		bi.mileage = 40;
		bi.color = "Red";
		bi.engineCC = 155;
		bi.getBikeDetails();
	}
}