class CarData {

  static String[] carBrand = {
        "Toyota", "Honda", "Hyundai", "Ford", "BMW",
        "Audi", "Kia", "Nissan", "Mercedes", "Tesla"
    };

    static int[] carPrice = {
        800000, 900000, 750000, 1000000, 4500000,
        5000000, 850000, 950000, 6000000, 7000000
    };

    static double[] carMileage = {
        18.5, 17.2, 20.1, 16.8, 14.5,
        15.3, 19.0, 18.2, 13.8, 0.0
    };

    static String[] carColour = {
        "Red", "White", "Black", "Blue", "Silver",
        "Grey", "Green", "Yellow", "Brown", "Orange"
    };

  public static void getCarDetails()
{
for(int index=0;index<carBrand.length;index++)
{
System.out.println("Car Brand:"+carBrand[index]);
System.out.println("Car price:"+carPrice[index]);
System.out.println("Car Mileage:"+carMileage[index]);
System.out.println("Car Colour:"+carColour[index]);
System.out.println("-----------------------------------");
}
}
}