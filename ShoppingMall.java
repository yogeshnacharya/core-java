class ShoppingMall
{
	
//Properties

    String name;
    String location;
    int numberOfShops;
    int numberOfStaff;
    String manager;
    double revenue;
    String type;
    boolean hasParking;
    boolean hasFoodCourt;
    int establishedYear;

    static String country="India";
    static String category="Retail";

//Behaviour

    public String openShop(String shop)
	{
		System.out.println("Shop: "+shop);
		return shop; 
	}
    public int closeShop(int id)
	{
		System.out.println("Closed: "+id);
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
    public boolean openMall(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean manageSecurity(boolean status)
	{
		System.out.println("Security: "+status);
		return status; 
	}
    public String announceOffer(String offer)
	{
		System.out.println("Offer: "+offer);
		return offer; 
	}
    public int totalShops(int count)
	{
		System.out.println("Shops: "+count);
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