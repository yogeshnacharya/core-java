class TelevisionData
{
    
    static int tvPrice[] = {
        15000, 18000, 20000, 22000, 25000,
        27000, 30000, 32000, 35000, 38000,
        40000, 42000, 45000, 48000, 50000
    };

    
    static float tvScreenSize[] = {
        32.0f, 40.0f, 42.5f, 43.0f, 50.0f,
        55.0f, 58.0f, 60.0f, 65.0f, 70.0f,
        75.0f, 32.5f, 43.5f, 50.5f, 55.5f
    };

    
    static long tvSerialNumber[] = {
        9001002001L, 9001002002L, 9001002003L, 9001002004L, 9001002005L,
        9001002006L, 9001002007L, 9001002008L, 9001002009L, 9001002010L,
        9001002011L, 9001002012L, 9001002013L, 9001002014L, 9001002015L
    };

    
    static short tvWarrantyMonths[] = {
        12, 12, 24, 24, 36,
        36, 12, 24, 36, 12,
        24, 36, 12, 24, 36
    };

    public static void main(String[] args)
    {
        System.out.println("Television Prices:");
        for(int i=0;i<tvPrice.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(tvPrice[i]);
        }
		}

        System.out.println("Television Screen Sizes:");
        for(int i=0;i<tvScreenSize.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(tvScreenSize[i]);
        }
		}

        System.out.println("Television Serial Numbers:");
        for(int i=0;i<tvSerialNumber.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(tvSerialNumber[i]);
        }
		}

        System.out.println("Television Warranty Months:");
        for(int i=0;i<tvWarrantyMonths.length;i++)
        {
		if(i%2!=0)
		{
            System.out.println(tvWarrantyMonths[i]);
        }
		}
    }
}