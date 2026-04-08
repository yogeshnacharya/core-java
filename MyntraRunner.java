class MyntraRunner
{
    public static void main(String[] args)
    {
        Myntra instance = new Myntra();
        double Price = instance.getPriceByProductType("Shoes");
        System.out.println("Product Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(2000, 2);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}