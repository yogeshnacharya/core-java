class Restaurant 
{

//properties

    String name;
    String location;
    int numberOfTables;
    int numberOfStaff;
    String chef;
    double price;
    String cuisine;
    boolean hasAC;
    boolean hasDelivery;
    int establishedYear;

    static String country="India";
    static String type="Food";

//behaviours

    public String prepareFood(String food)
	{
		System.out.println("Food: "+food);
		return food; 
	}
    public int serveCustomers(int count)
	{
		System.out.println("Served: "+count);
		return count; 
	}
    public String assignChef(String name)
	{
		System.out.println("Chef: "+name);
		return name; 
	}
    public double collectBill(double bill)
	{
		System.out.println("Bill: "+bill);
		return bill; 
	}
    public boolean openRestaurant(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean takeOrder(boolean status)
	{
		System.out.println("Order: "+status);
		return status; 
	}
    public String announceOffer(String offer)
	{
		System.out.println("Offer: "+offer);
		return offer; 
	}
    public int totalCustomers(int count)
	{
		System.out.println("Customers: "+count);
		return count; 
	}
    public String organizeParty(String party)
	{
		System.out.println("Party: "+party);
		return party; 
	}
    public boolean maintainCleanliness(boolean status)
	{
		System.out.println("Clean: "+status);
		return status; 
	}
}