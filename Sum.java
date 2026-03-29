class Sum
{
    public static void calculateSum()
	{
        int sum = 0;
        for(int i = 1; i <= 10; i++)
		{
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}