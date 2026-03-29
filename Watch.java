class Watch
{
    static float watchPrice = 2000.1f;
    static String watchBrand = "Fast Track";
    static int manufacturerYear = 2017;

    public static void getWatchDetails()
    {
        System.out.println("Watch price: " + watchPrice);
    }

    public static String getWatchBrand()
    {
        System.out.println("Watch Brand: " + watchBrand);
        return watchBrand;
    }

    public static String getWatchManufacturer(String manufacturer)
    {
        System.out.println("Watch Manufacturer: " + manufacturer);
        return manufacturer;
    }

    public static void getWatchManufacturingYear()
    {
        System.out.println("Watch Manufacturing Year: " + manufacturerYear);
    }
}
