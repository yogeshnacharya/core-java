class SuperMarket 
{

//Properties

    String name;
    String location;
    int numberOfProducts;
    int numberOfStaff;
    String manager;
    double revenue;
    String type;
    boolean hasBillingSystem;
    boolean hasParking;
    int establishedYear;

    static String country="India";
    static String category="Retail";

//Behaviours

    public String addProduct(String product)
	{
		System.out.println("Product: "+product);
		return product; 
	}
    public int removeProduct(int id)
	{
		System.out.println("Removed: "+id);
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
    public boolean openStore(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean processBilling(boolean status)
	{
		System.out.println("Billing: "+status);
		return status; 
	}
    public String announceOffer(String offer)
	{
		System.out.println("Offer: "+offer);
		return offer; 
	}
    public int totalProducts(int count)
	{
		System.out.println("Products: "+count);
		return count; 
	}
    public String organizeSale(String sale)
	{
		System.out.println("Sale: "+sale);
		return sale; 
	}
    public boolean maintainStock(boolean status)
	{
		System.out.println("Stock: "+status);
		return status; 
	}
}