class BigBasketRunner
{
    public static void main(String[] args)
    {
        BigBasket instance = new BigBasket();
        double Price = instance.getPriceByProductName("Rice");
        System.out.println("Product Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(60, 5);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}