class Rapido
{
	Rapido()
	{
		this("Bike Ride");
		System.out.println("I am Rapido Constructor 1");
	}

	Rapido(String rideType)
	{
		this("Bike Ride","Captain Ravi");
		System.out.println("I am Rapido Constructor 2");
		System.out.println("Ride Type:"+rideType);
	}

	Rapido(String rideType,String driverName)
	{
		this("Bike Ride",120.5);
		System.out.println("I am Rapido Constructor 3");
		System.out.println("Ride Type:"+rideType);
		System.out.println("Driver Name:"+driverName);
	}

	Rapido(String rideType,double fare)
	{
		this("Bike Ride",4.6f);
		System.out.println("I am Rapido Constructor 4");
		System.out.println("Ride Type:"+rideType);
		System.out.println("Fare:"+fare);
	}

	Rapido(String rideType,float rating)
	{
		System.out.println("I am Rapido Constructor 5");
		System.out.println("Ride Type:"+rideType);
		System.out.println("Rating:"+rating);
	}
}