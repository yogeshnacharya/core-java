class OlaRunner
{
    public static void main(String[] args)
    {
        Ola instance = new Ola();
        double Price = instance.getPriceByLocation("Suburb");
        System.out.println("Ride Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(400, 1);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}