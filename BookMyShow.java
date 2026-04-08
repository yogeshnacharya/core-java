class BookMyShow
{
    public double getPriceByMovieName(String MovieName)
    {
        System.out.println("invoking getPriceByMovieName: " + MovieName);
        double Price = 0.0;

        if("Avatar"==MovieName)
        {
            Price = 300;
        }
        else if("Avengers"==MovieName)
        {
            Price = 350;
        }
        else if("Inception"==MovieName)
        {
            Price = 280;
        }
        else if("Titanic"==MovieName)
        {
            Price = 250;
        }
        else if("Interstellar"==MovieName)
        {
            Price = 320;
        }
        else
        {
            Price = 0.0;
        }

        System.out.println("end of getPriceByMovieName");
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

