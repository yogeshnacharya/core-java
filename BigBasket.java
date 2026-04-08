class BigBasket
{
    public double getPriceByProductName(String ProductName)
    {
        System.out.println("invoking getPriceByProductName: " + ProductName);
        double Price = 0.0;

        if("Rice"==ProductName)
        {
            Price = 60;
        }
        else if("Wheat Flour"==ProductName)
        {
            Price = 40;
        }
        else if("Sugar"==ProductName)
        {
            Price = 45;
        }
        else if("Oil"==ProductName)
        {
            Price = 110;
        }
        else if("Milk"==ProductName)
        {
            Price = 28;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByProductName");
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

