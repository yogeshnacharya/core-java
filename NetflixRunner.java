class NetflixRunner
{
    public static void main(String[] args)
    {
        Netflix instance = new Netflix();
        double Price = instance.getPriceByPlanName("Premium");
        System.out.println("Plan Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(799, 6);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}