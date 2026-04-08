class Uber
{
    public double getPriceByDestination(String Destination)
    {
        System.out.println("invoking getPriceByDestination: " + Destination);
        double Price = 0.0;

        if("Airport"==Destination)
        {
            Price = 500;
        }
        else if("Railway Station"==Destination)
        {
            Price = 350;
        }
        else if("City Center"==Destination)
        {
            Price = 200;
        }
        else if("Mall"==Destination)
        {
            Price = 150;
        }
        else if("Hotel"==Destination)
        {
            Price = 100;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByDestination");
        return Price;
    }

    public double getTotalAmountByPriceAndQuantity(double Price, int Quantity)
    {
        System.out.println("invoking getTotalAmountByPriceAndQuantity");
        double TotalPrice = Price * Quantity;
        System.out.println("end of getTotalAmountByPriceAndQuantity");
        return TotalPrice;
    }

    public double getDiscount(double TotalPrice)
    {
        System.out.println("invoking getDiscount");
        double Discount = TotalPrice - (TotalPrice * 0.10);
        System.out.println("end of getDiscount");
        return Discount;
    }
}

