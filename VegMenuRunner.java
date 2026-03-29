class VegMenuRunner
{
	public static void main(String [] veg)
	{
		VegMenu ref=new VegMenu();
		ref.getVegMenuDetails();
		
		VegMenu parijatha=new VegMenu();
		parijatha.checkVegFoodByFoodName("Lemon Rice");
		parijatha.checkVegFoodByFoodName("Curd Rice");
		parijatha.checkVegFoodByFoodName("Aloo Paratha");
		parijatha.checkVegFoodByFoodName("Bisible Bath");
		double price=parijatha.CheckVegFoodPriceByFoodName("Lemon Rice");
		System.out.println("The price is:"+price);
		double price1=parijatha.CheckVegFoodPriceByFoodName("Bisibele Bath");
		System.out.println("The price is:"+price1);
		double price2=parijatha.CheckVegFoodPriceByFoodName("Curd Rice");
		System.out.println("The price is:"+price2);
		double price3=parijatha.CheckVegFoodPriceByFoodName("Aloo Paratha");
		System.out.println("The price is:"+price3);
		
		VegMenu padmasagar=new VegMenu();
		padmasagar.checkVegFoodByFoodName("Sambar Rice");
		padmasagar.checkVegFoodByFoodName("Veg Pulao");
		padmasagar.checkVegFoodByFoodName("Chitranna");
		padmasagar.checkVegFoodByFoodName("Panneer Butter Masala");
		
		VegMenu udupiVaibhav=new VegMenu();
		udupiVaibhav.checkVegFoodByFoodName("Veg Biriyani");
		udupiVaibhav.checkVegFoodByFoodName("Curd Rice");
		udupiVaibhav.checkVegFoodByFoodName("Panneer Butter Masala");
		udupiVaibhav.checkVegFoodByFoodName("Bisible Bath");
		
		VegMenu vishranth=new VegMenu();
		vishranth.checkVegFoodByFoodName("Lemon Rice");
		vishranth.checkVegFoodByFoodName("Palak Panneer");
		vishranth.checkVegFoodByFoodName("Aloo Paratha");
		vishranth.checkVegFoodByFoodName("Dal Tadka");
		
		VegMenu apoorvaDarshini=new VegMenu();
		apoorvaDarshini.checkVegFoodByFoodName("Lemon Rice");
		apoorvaDarshini.checkVegFoodByFoodName("Curd Rice");
		apoorvaDarshini.checkVegFoodByFoodName("Aloo Paratha");
		apoorvaDarshini.checkVegFoodByFoodName("pongal");
	}
}