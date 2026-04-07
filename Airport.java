class Airport 
{
	
//Properties

    String name;
    String location;
    int numberOfFlights;
    int numberOfStaff;
    String director;
    double revenue;
    String type;
    boolean hasInternationalFlights;
    boolean hasCargo;
    int establishedYear;

    static String country="India";
    static String category="Transport";

//Behaviours

    public String scheduleFlight(String flight)
	{
		System.out.println("Flight: "+flight);
		return flight; 
	}
    public int cancelFlight(int id)
	{
		System.out.println("Cancelled: "+id);
		return id; 
	}
    public String assignStaff(String name)
	{
		System.out.println("Staff: "+name);
		return name; 
	}
    public double generateRevenue(double amount)
	{
		System.out.println("Revenue: "+amount);
		return amount; 
	}
    public boolean openAirport(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean handleSecurity(boolean status)
	{
		System.out.println("Security: "+status);
		return status; 
	}
    public String announceFlight(String flight)
	{
		System.out.println("Announcement: "+flight);
		return flight; 
	}
    public int totalFlights(int count)
	{
		System.out.println("Flights: "+count);
		return count; 
	}
    public String organizeOperation(String op)
	{
		System.out.println("Operation: "+op);
		return op; 
	}
    public boolean maintainSafety(boolean status)
	{
		System.out.println("Safety: "+status);
		return status; 
	}
}