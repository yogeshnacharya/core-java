class NonVegMenuRunner
{
	public static void main(String [] nonveg)
	{
		NonVegMenu ref=new NonVegMenu();
		ref.getNonVegMenuDetails();
		
		NonVegMenu hoohalli=new NonVegMenu();
		hoohalli.checkNonVegFoodByFoodName("Chicken Tikka");
		hoohalli.checkNonVegFoodByFoodName("Egg Rice");
		hoohalli.checkNonVegFoodByFoodName("Chicken Tandoori");
		hoohalli.checkNonVegFoodByFoodName("Mutton Curry");
		
		NonVegMenu lishanth=new NonVegMenu();
		lishanth.checkNonVegFoodByFoodName("Prawn Fry");
		lishanth.checkNonVegFoodByFoodName("Bellulli Kabab");
		lishanth.checkNonVegFoodByFoodName("Nati Koli Saru Mudde");
		lishanth.checkNonVegFoodByFoodName("Fish Curry");
		double price=lishanth.CheckNonVegFoodPriceByFoodName("Prawn Fry");
		System.out.println("The price is:"+price);
		double price1=lishanth.CheckNonVegFoodPriceByFoodName("Bellulli Kabab");
		System.out.println("The price is:"+price1);
		double price2=lishanth.CheckNonVegFoodPriceByFoodName("Nati Koli Saru Mudde");
		System.out.println("The price is:"+price2);
		double price3=lishanth.CheckNonVegFoodPriceByFoodName("Fish Curry");
		System.out.println("The price is:"+price3);
		
		NonVegMenu maurya=new NonVegMenu();
		maurya.checkNonVegFoodByFoodName("Chicken Biriyani");
		maurya.checkNonVegFoodByFoodName("Chicken Tikka");
		maurya.checkNonVegFoodByFoodName("Prawn Masala");
		maurya.checkNonVegFoodByFoodName("Bisible Bath");
		
		NonVegMenu cauvery =new NonVegMenu();
		cauvery.checkNonVegFoodByFoodName("Chicken Biriyani");
		cauvery.checkNonVegFoodByFoodName("Mutton Biriyani");
		cauvery.checkNonVegFoodByFoodName("Aloo Paratha");
		cauvery.checkNonVegFoodByFoodName("Fish Curry");
		
		NonVegMenu gowdruKitchen=new NonVegMenu();
		gowdruKitchen.checkNonVegFoodByFoodName("Chicken Tikka");
		gowdruKitchen.checkNonVegFoodByFoodName("Chicken Kabab");
		gowdruKitchen.checkNonVegFoodByFoodName("Prawn Masala");
		gowdruKitchen.checkNonVegFoodByFoodName("Kyma Unde");
	}
}