class PoliceStation 
{
//properties

    String stationName;
    String location;
    int numberOfCases;
    int numberOfOfficers;
    String inspector;
    double fineAmount;
    String type;
    boolean hasJail;
    boolean hasVehicles;
    int establishedYear;

    static String country="India";
    static String department="Police";

//behaviours

    public String registerCase(String caseName)
	{
		System.out.println("Case: "+caseName);
		return caseName; 
	}
    public int closeCase(int id)
	{
		System.out.println("Closed: "+id);
		return id; 
	}
    public String assignOfficer(String name)
	{
		System.out.println("Officer: "+name);
		return name; 
	}
    public double collectFine(double fine)
	{
		System.out.println("Fine: "+fine);
		return fine; 
	}
    public boolean openJail(boolean status)
	{
		System.out.println("Jail: "+status);
		return status; 
	}
    public boolean conductInvestigation(boolean status)
	{
		System.out.println("Investigation: "+status);
		return status; 
	}
    public String announceNotice(String notice)
	{
		System.out.println("Notice: "+notice);
		return notice; 
	}
    public int totalCases(int count)
	{
		System.out.println("Cases: "+count);
		return count; 
	}
    public String organizePatrol(String patrol)
	{
		System.out.println("Patrol: "+patrol);
		return patrol; 
	}
    public boolean maintainLaw(boolean status)
	{
		System.out.println("Law: "+status);
		return status; 
	}
}