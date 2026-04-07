class Hotel 
{

//properties

    String name;
    String location;
    int numberOfRooms;
    int numberOfStaff;
    String manager;
    double price;
    String type;
    boolean hasWifi;
    boolean hasPool;
    int establishedYear;

    static String country="India";
    static String category="Hospitality";

//behaviours

    public String bookRoom(String room)
	{
		System.out.println("Room: "+room);
		return room; 
	}
    public int checkout(int id)
	{
		System.out.println("Checkout: "+id);
		return id; 
	}
    public String assignStaff(String name)
	{
		System.out.println("Staff: "+name);
		return name; 
	}
    public double collectBill(double bill)
	{
		System.out.println("Bill: "+bill);
		return bill; 
	}
    public boolean openHotel(boolean status)
	{
		System.out.println("Open: "+status);
		return status;
	}
    public boolean provideService(boolean status)
	{
		System.out.println("Service: "+status);
		return status; 
	}
    public String announceOffer(String offer)
	{
		System.out.println("Offer: "+offer);
		return offer; 
	}
    public int totalGuests(int count)
	{
		System.out.println("Guests: "+count);
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