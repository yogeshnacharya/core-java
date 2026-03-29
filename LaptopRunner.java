class LaptopRunner
{
	public static void main(String [] laptop)
	{
		Laptop lapt=new Laptop("Dell","i5",55000,8,512,"Windows");
		Laptop lap=new Laptop();
		lap.brand = "Dell";
        lap.processor = "i5";
        lap.price = 55000;
        lap.ram = 8;
        lap.storage = 512;
        lap.os = "Windows";
		
		lap.getLaptopDetails();

	}
}