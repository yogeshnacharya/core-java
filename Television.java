class Television
{
	static String brandName="LG";
	static String brandType="Electronic Device";
	
	public static void display1()
	{
		System.out.println("Brand Name:"+brandName);
	}
	public static String display2()
	{
		System.out.println("Brand Type:"+brandType);
		return brandType;
	}
	public static void display3(double price)
	{
		System.out.println("Price:"+price);
	}
	public static String display4(String mfgDate)
	{
		System.out.println("Mfg Date:"+mfgDate);
		return mfgDate;
	}
}