class RefrigeratorRunner
{
	public static void main(String [] fridge)
	{
		Refrigerator refr=new Refrigerator("Whirlpool",260,25000,"Double Door",true,3);
		Refrigerator ref=new Refrigerator();
		ref.brand = "Whirlpool";
		ref.capacity = 260;
		ref.price = 25000;
		ref.type = "Double Door";
		ref.inverter = true;
		ref.warranty = 3;
		
		ref.getFridgeDetails();
	}
}