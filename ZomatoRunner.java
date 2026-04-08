class ZomatoRunner
{
    public static void main(String[] args)
    {
        Zomato instance = new Zomato();
        double Price = instance.getPriceByDishName("Pizza");
        System.out.println("Dish Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(250, 2);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}