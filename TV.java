class TV
{
    static float tvPrice = 65000.5f;
    static String tvBrand = "Sony";
    static int manufacturerYear = 2015;

    public static void getTvDetails()
    {
        System.out.println("Tv price: " + tvPrice);
    }

    public static String getTvBrand()
    {
        System.out.println("Tv Brand: " + tvBrand);
        return tvBrand;
    }

    public static String getTvManufacturer(String manufacturer)
    {
        System.out.println("Laptop Manufacturer: " + manufacturer);
        return manufacturer;
    }

    public static void getTvManufacturingYear()
    {
        System.out.println("Tv Manufacturing Year: " + manufacturerYear);
    }
}
