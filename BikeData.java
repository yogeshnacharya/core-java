class BikeData 
{
    static int bikePrice[] = {
        85000, 90000, 95000, 100000, 110000,
        120000, 130000, 140000, 150000, 160000,
        170000, 180000, 190000, 200000, 210000
    };

    
    static float bikeMileage[] = {
        45.5f, 50.2f, 55.0f, 60.3f, 48.6f,
        52.4f, 58.1f, 62.0f, 47.8f, 53.6f,
        49.9f, 57.2f, 61.5f, 46.3f, 54.7f
    };

   
    static long bikeRegistration[] = {
        9876543210L, 9876543211L, 9876543212L, 9876543213L, 9876543214L,
        9876543215L, 9876543216L, 9876543217L, 9876543218L, 9876543219L,
        9876543220L, 9876543221L, 9876543222L, 9876543223L, 9876543224L
    };

    
    static short bikeEngineCC[] = {
        100, 110, 125, 135, 150,
        160, 180, 200, 220, 250,
        300, 350, 400, 450, 500
    };

    public static void main(String[] bikes)
	{
		System.out.println("Bike Price");
		for(int i=0;i<bikePrice.length;i++)
		{
		if (i%2==0)
		{
		System.out.println(bikePrice[i]);
		}
		}
		System.out.println("Bike Mileage");
		for (int i=0;i<bikeMileage.length;i++)
		{
		if (i%2==0)
		{
		System.out.println(bikeMileage[i]);
		}
		}
		System.out.println("Bike Registration");
		for(int i=0;i<bikeRegistration.length;i++)
		{	
		if (i%2==0)
		{
		System.out.println(bikeRegistration[i]);
		}
		}
		System.out.println("Bike Engine CC:");
		for(int i=0;i<bikeEngineCC.length;i++)
		{
		if (i%2==0)
		{	
		System.out.println(bikeEngineCC[i]);
		}
		}
    }
}