class BookMyShowRunner
{
    public static void main(String[] args)
    {
        BookMyShow instance = new BookMyShow();
        double Price = instance.getPriceByMovieName("Avengers");
        System.out.println("Ticket Price: " + Price);
        double TotalAmount = instance.getTotalAmountByPriceAndQuantity(350, 4);
        System.out.println("Total Price: " + TotalAmount);
        double Discount = instance.getDiscount(TotalAmount);
        System.out.println("Discount Price: " + Discount);
    }
}