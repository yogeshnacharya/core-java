class Flipkart
{
    public double getPriceByItemName(String ItemName)
    {
        System.out.println("invoking getPriceByItemName: " + ItemName);
        double Price = 0.0;

        if("TV"==ItemName)
        {
            Price = 35000;
        }
        else if("Refrigerator"==ItemName)
        {
            Price = 28000;
        }
        else if("Washing Machine"==ItemName)
        {
            Price = 22000;
        }
        else if("AC"==ItemName)
        {
            Price = 32000;
        }
        else if("Microwave"==ItemName)
        {
            Price = 12000;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByItemName");
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

