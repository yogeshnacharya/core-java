class SchoolBus 
{
	
//Properties

    String busNumber;
    String route;
    int numberOfStudents;
    int numberOfSeats;
    String driverName;
    double fare;
    String busType;
    boolean hasGPS;
    boolean hasCamera;
    int manufacturingYear;

    static String country = "India";
    static String serviceType = "Transport";

//Behaviour

    public String startTrip(String routeName) 
	{
        System.out.println("Trip Started: " + routeName);
        return routeName;
    }

    public int pickStudents(int count) 
	{
        System.out.println("Students Picked: " + count);
        return count;
    }

    public String assignDriver(String name) 
	{
        System.out.println("Driver Assigned: " + name);
        return name;
    }

    public double collectFare(double amount) 
	{
        System.out.println("Fare Collected: " + amount);
        return amount;
    }

    public boolean startBus(boolean status) 
	{
        System.out.println("Bus Started: " + status);
        return status;
    }

    public boolean stopBus(boolean status) 
	{
        System.out.println("Bus Stopped: " + status);
        return status;
    }

    public String announceStop(String stop) 
	{
        System.out.println("Next Stop: " + stop);
        return stop;
    }

    public int totalStudents(int count) 
	{
        System.out.println("Total Students: " + count);
        return count;
    }

    public String maintainRoute(String route) 
	{
        System.out.println("Route Maintained: " + route);
        return route;
    }

    public boolean ensureSafety(boolean status) 
	{
        System.out.println("Safety Ensured: " + status);
        return status;
    }
}