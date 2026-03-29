class WatchRunner
{
	public static void main(String [] watch)
	{
		Watch watc=new Watch("Fastrack","Analog",1999,"Blue",true,2);
		Watch wat=new Watch();
		wat.brand = "Fastrack";
        wat.type = "Analog";
        wat.price = 1999;
        wat.color = "Blue";
        wat.waterproof = true;
        wat.warranty = 2;
		
		wat.getWatchDetails();
	}
}