class Laptop
{
    static float laptopPrice = 25000.7f;
    static String laptopBrand = "Dell";
    static int manufacturerYear = 2012;

    public static void getLaptopDetails()
    {
        System.out.println("Laptop price: " + laptopPrice);
    }

    public static String getLaptopBrand()
    {
        System.out.println("Laptop Brand: " + laptopBrand);
        return laptopBrand;
    }

    public static String getLaptopManufacturer(String manufacturer)
    {
        System.out.println("Laptop Manufacturer: " + manufacturer);
        return manufacturer;
    }

    public static void getLaptopManufacturingYear()
    {
        System.out.println("Laptop Manufacturing Year: " + manufacturerYear);
    }
}
