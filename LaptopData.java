class LaptopData
{
    
    static int laptopPrice[] = {
        45000, 50000, 55000, 60000, 65000,
        70000, 75000, 80000, 85000, 90000,
        95000, 100000, 110000, 120000, 130000
    };

    
    static String laptopBrand[] = {
        "Dell", "HP", "Lenovo", "Asus", "Acer",
        "Apple", "MSI", "Samsung", "LG", "Microsoft",
        "Razer", "Toshiba", "Huawei", "Realme", "Xiaomi"
    };

    
    static double laptopScreenSize[] = {
        13.3, 14.0, 15.6, 16.0, 17.3,
        14.5, 13.5, 15.0, 16.5, 17.0,
        14.2, 15.2, 13.8, 16.2, 17.5
    };

    
    static short laptopRAM[] = {
        4, 8, 8, 16, 16,
        32, 4, 8, 16, 32,
        8, 16, 32, 4, 8
    };

    public static void main(String[] args)
    {
        System.out.println("Laptop Prices:");
        for(int i=0;i<laptopPrice.length;i++)
        {
		if(i%2==0)
		{
            System.out.println(laptopPrice[i]);
        }
		}

        System.out.println("Laptop Brands:");
        for(int i=0;i<laptopBrand.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(laptopBrand[i]);
        }
		}

        System.out.println("Laptop Screen Sizes:");
        for(int i=0;i<laptopScreenSize.length;i++)
        {
		if(i%2==0)
		{
            System.out.println(laptopScreenSize[i]);
        }
		}

        System.out.println("Laptop RAM:");
        for(int i=0;i<laptopRAM.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(laptopRAM[i]);
        }
		}
    }
}