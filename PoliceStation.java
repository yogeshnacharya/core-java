class PoliceStation
{
	String stationName;
	String inspectorName;
	static int noOfOfficers=25;
	String location;
	String commissionerName;
	String zone;
	
	public PoliceStation()
	{
		
	}
	public PoliceStation(String stationName,String inspectorName,String location,String commissionerName,String zone)
	{
		this.stationName=stationName;
		this.inspectorName=inspectorName;
		this.location=location;
		this.commissionerName=commissionerName;
		this.zone=zone;
	}
	public void displayPoliceStationDetails()
	{
		System.out.println("Station Name:"+stationName);
		System.out.println("Inspector Name:"+inspectorName);
		System.out.println("No Of Officers:"+noOfOfficers);
		System.out.println("Location:"+location);
		System.out.println("Commissioner Name:"+commissionerName);
		System.out.println("Zone:"+zone);
		System.out.println("---------------------------");
	}
}