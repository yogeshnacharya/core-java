class SwiggyRunner
{
	public static void main(String[] args)
	{
		Swiggy instance = new Swiggy();

		double Price = instance.getPriceByFoodName("Biriyani");
		System.out.println("FoodPrice: " +Price);

		double TotalAmount = instance.getTotalAmountByPriceAndQuantity(120, 3);
		System.out.println("TotalPrice: " + TotalAmount);
		

		double Discount = instance.getDiscount(TotalAmount);
		System.out.println("Discount Price: " + Discount);
	}
}