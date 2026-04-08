class UberRunner
{
    public static void main(String[] args)
    {
        Uber instance = new Uber();
        double Price = instance.getPriceByDestination("Airport");
        System.out.println("Ride Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(500, 1);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}