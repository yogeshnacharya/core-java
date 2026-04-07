class BusStand 
{
	
//Properties

    String name;
    String location;
    int numberOfBuses;
    int numberOfStaff;
    String manager;
    double revenue;
    String type;
    boolean hasWaitingArea;
    boolean hasTicketCounter;
    int establishedYear;

    static String country="India";
    static String category="Transport";

//Behaviours

    public String scheduleBus(String bus)
	{
		System.out.println("Bus: "+bus);
		return bus; 
	}
    public int cancelBus(int id)
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
    public boolean openStand(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean manageTraffic(boolean status)
	{
		System.out.println("Traffic: "+status);
		return status; 
	}
    public String announceBus(String bus)
	{
		System.out.println("Announcement: "+bus);
		return bus; 
	}
    public int totalBuses(int count)
	{
		System.out.println("Buses: "+count);
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