class Myntra
{
    public double getPriceByProductType(String ProductType)
    {
        System.out.println("invoking getPriceByProductType: " + ProductType);
        double Price = 0.0;

        if("Shirt"==ProductType)
        {
            Price = 800;
        }
        else if("Jeans"==ProductType)
        {
            Price = 1200;
        }
        else if("Shoes"==ProductType)
        {
            Price = 2000;
        }
        else if("Jacket"==ProductType)
        {
            Price = 2500;
        }
        else if("Watch"==ProductType)
        {
            Price = 1500;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByProductType");
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

