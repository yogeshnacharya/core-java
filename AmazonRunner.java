class AmazonRunner
{
    public static void main(String[] args)
    {
        Amazon instance = new Amazon();
        double Price = instance.getPriceByProductName("Laptop");
        System.out.println("Product Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(45000, 2);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}