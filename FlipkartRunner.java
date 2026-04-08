class FlipkartRunner
{
    public static void main(String[] args)
    {
        Flipkart instance = new Flipkart();
        double Price = instance.getPriceByItemName("TV");
        System.out.println("Item Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(35000, 1);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}