class Ola
{
    public double getPriceByLocation(String Location)
    {
        System.out.println("invoking getPriceByLocation: " + Location);
        double Price = 0.0;

        if("Downtown"==Location)
        {
            Price = 250;
        }
        else if("Suburb"==Location)
        {
            Price = 400;
        }
        else if("Business District"==Location)
        {
            Price = 300;
        }
        else if("Residential Area"==Location)
        {
            Price = 180;
        }
        else if("Tourist Spot"==Location)
        {
            Price = 450;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByLocation");
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

