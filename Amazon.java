class Amazon
{
    public double getPriceByProductName(String ProductName)
    {
        System.out.println("invoking getPriceByProductName: " + ProductName);
        double Price = 0.0;

        if("Laptop"==ProductName)
        {
            Price = 45000;
        }
        else if("Mobile"==ProductName)
        {
            Price = 15000;
        }
        else if("Headphones"==ProductName)
        {
            Price = 1500;
        }
        else if("Smart Watch"==ProductName)
        {
            Price = 3000;
        }
        else if("Tablet"==ProductName)
        {
            Price = 25000;
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

