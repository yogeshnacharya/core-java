class RailwayStation 
{
	
//Properties
    String name;
    String location;
    int numberOfTrains;
    int numberOfStaff;
    String manager;
    double revenue;
    String type;
    boolean hasPlatforms;
    boolean hasReservation;
    int establishedYear;

    static String country="India";
    static String category="Transport";

//Behaviours

    public String scheduleTrain(String train)
	{
		System.out.println("Train: "+train);
		return train; 
	}
    public int cancelTrain(int id)
	{
		System.out.println("Cancelled: "+id);
		return id; 
	}
    public String assignStaff(String name)
	{
		System.out.println("Staff: "+name);
		return name; 
	}
    public double collectFare(double fare)
	{
		System.out.println("Fare: "+fare);
		return fare; 
	}
    public boolean openStation(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean manageCrowd(boolean status)
	{
		System.out.println("Crowd: "+status);
		return status; 
	}
    public String announceTrain(String train)
	{
		System.out.println("Announcement: "+train);
		return train; 
	}
    public int totalTrains(int count)
	{
		System.out.println("Trains: "+count);
		return count; 
	}
    public String organizeService(String service)
	{
		System.out.println("Service: "+service);
		return service; 
	}
    public boolean maintainCleanliness(boolean status)
	{
		System.out.println("Clean: "+status);
		return status; 
	}
}