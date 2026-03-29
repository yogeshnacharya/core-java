class MobileData
{
    
    static double mobilePrice[] = {
        10.5, 12.0, 15.8, 18.4, 20.2,
        22.5, 25.0, 28.3, 30.7, 35.1
    };

    
    static byte mobileRAM[] = {
        2, 3, 4, 4, 6,
        6, 8, 8, 12, 12
    };

    
    static String mobileBrand[] = {
        "Samsung", "Apple", "OnePlus", "Xiaomi", "Realme",
        "Vivo", "Oppo", "Motorola", "Nokia", "Google"
    };

    
    static boolean mobile5G[] = {
        true, true, true, true, true,
        true, true, true, false, true
    };
	
public static void getMobileDetails()
{
for(int index=0;index<mobilePrice.length;index++)
{
System.out.println("Mobile Price:"+mobilePrice[index]);
System.out.println("Mobile RAM:"+mobileRAM[index]);
System.out.println("Mobile Brand:"+mobileBrand[index]);
System.out.println("Mobile 5G:"+mobile5G[index]);
System.out.println("-----------------------------------");
}
}
}