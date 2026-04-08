class Zomato
{
    public double getPriceByDishName(String DishName)
    {
        System.out.println("invoking getPriceByDishName: " + DishName);
        double Price = 0.0;

        if("Pizza"==DishName)
        {
            Price = 250;
        }
        else if("Burger"==DishName)
        {
            Price = 120;
        }
        else if("Pasta"==DishName)
        {
            Price = 180;
        }
        else if("Noodles"==DishName)
        {
            Price = 150;
        }
        else if("Sandwich"==DishName)
        {
            Price = 90;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByDishName");
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

