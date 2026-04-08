class Netflix
{
    public double getPriceByPlanName(String PlanName)
    {
        System.out.println("invoking getPriceByPlanName: " + PlanName);
        double Price = 0.0;

        if("Basic"==PlanName)
        {
            Price = 199;
        }
        else if("Standard"==PlanName)
        {
            Price = 499;
        }
        else if("Premium"==PlanName)
        {
            Price = 799;
        }
        else if("Family"==PlanName)
        {
            Price = 999;
        }
        else if("Student"==PlanName)
        {
            Price = 149;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByPlanName");
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

