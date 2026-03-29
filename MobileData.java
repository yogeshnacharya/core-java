class MobileData
{
    
    static double mobilePrice[] = {
        10.5, 12.0, 15.8, 18.4, 20.2,
        22.5, 25.0, 28.3, 30.7, 35.1,
        40.5, 45.0, 50.2, 55.6, 60.0
    };

    
    static byte mobileRAM[] = {
        2, 3, 4, 4, 6,
        6, 8, 8, 12, 12,
        4, 6, 8, 12, 16
    };

    
    static String mobileBrand[] = {
        "Samsung", "Apple", "OnePlus", "Xiaomi", "Realme",
        "Vivo", "Oppo", "Motorola", "Nokia", "Google",
        "Sony", "Asus", "Honor", "Huawei", "Lenovo"
    };

    
    static boolean mobile5G[] = {
        true, true, true, true, true,
        true, true, true, false, true,
        false, true, true, true, false
    };

    public static void main(String[] args)
    {
        System.out.println("Mobile Prices:");
        for(int i=0;i<mobilePrice.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(mobilePrice[i]);
        }
		}

        System.out.println("Mobile RAM:");
        for(int i=0;i<mobileRAM.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(mobileRAM[i]);
        }
		}

        System.out.println("Mobile Brands:");
        for(int i=0;i<mobileBrand.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(mobileBrand[i]);
        }
		}

        System.out.println("5G Support:");
        for(int i=0;i<mobile5G.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(mobile5G[i]);
        }
		}
    }
}