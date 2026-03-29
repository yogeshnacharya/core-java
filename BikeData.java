class BikeData 
{

    static String  bikeBrand[]={"Honda","Yamaha","Royal Enfield","Bajaj","TVS",
        "Hero MotorCorp","KTM","Suzuki","BMW Motoradd","Kawasaki"
	};
	
	
    static int bikePrice[] = {
        85000, 90000, 95000, 100000, 110000,
        120000, 130000, 140000, 150000, 160000
    };

    
    static float bikeMileage[] = {
        45.5f, 50.2f, 55.0f, 60.3f, 48.6f,
        52.4f, 58.1f, 62.0f, 47.8f, 53.6f
    };

    
    static short bikeEngineCC[] = {
        100, 110, 125, 135, 150,
        160, 180, 200, 220, 250
    };
	
	public static void getBikeDetails()
{
for(int index=0;index<bikeBrand.length;index++)
{
System.out.println("Bike Brand:"+bikeBrand[index]);
System.out.println("Bike price:"+bikePrice[index]);
System.out.println("Bike Mileage:"+bikeMileage[index]);
System.out.println("Bike Engine CC:"+bikeEngineCC[index]);
System.out.println("-----------------------------------");
}
}
}
