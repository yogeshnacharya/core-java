class CinemaHall 
{
	
//Properties

    String name;
    String location;
    int numberOfScreens;
    int numberOfStaff;
    String manager;
    double ticketPrice;
    String type;
    boolean has3D;
    boolean hasAC;
    int establishedYear;

    static String country="India";
    static String category="Entertainment";

//Behaviour

    public String playMovie(String movie)
	{
		System.out.println("Movie: "+movie);
		return movie; 
	}
    public int stopMovie(int id)
	{
		System.out.println("Stopped: "+id);
		return id; 
	}
    public String assignStaff(String name)
	{
		System.out.println("Staff: "+name);
		return name; 
	}
    public double collectTicket(double amount)
	{
		System.out.println("Ticket: "+amount);
		return amount; 
	}
    public boolean openHall(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean manageShow(boolean status)
	{
		System.out.println("Show: "+status);
		return status; 
	}
    public String announceMovie(String movie)
	{
		System.out.println("Announcement: "+movie);
		return movie; 
	}
    public int totalShows(int count)
	{
		System.out.println("Shows: "+count);
		return count; 
	}
    public String organizeEvent(String event)
	{
		System.out.println("Event: "+event);
		return event; 
	}
    public boolean maintainCleanliness(boolean status)
	{
		System.out.println("Clean: "+status);
		return status; 
	}
}