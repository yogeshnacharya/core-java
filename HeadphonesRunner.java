class HeadphonesRunner
{
	public static void main(String [] headphones)
	{
		Headphones hea=new Headphones("Sony","Wireless",2999,"Black",true,20);
		Headphones head=new Headphones();
		head.brand = "Sony";
		head.type = "Wireless";
		head.price = 2999;
		head.color = "Black";
		head.noiseCancellation = true;
		head.batteryLife = 20;
		
		head.getHeadPhonesDetails();

	}
}