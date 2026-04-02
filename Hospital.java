class Hospital
{
	String hospitalName;
	String doctorName;
	static int noOfStaff=50;
	String location;
	String ownerName;
	String type;
	
	public Hospital()
	{
		
	}
	public Hospital(String hospitalName,String doctorName,String location,String ownerName,String type)
	{
		this.hospitalName=hospitalName;
		this.doctorName=doctorName;
		this.location=location;
		this.ownerName=ownerName;
		this.type=type;
	}
	public void displayHospitalDetails()
	{
		System.out.println("Hospital Name:"+hospitalName);
		System.out.println("Doctor Name:"+doctorName);
		System.out.println("No Of Staff:"+noOfStaff);
		System.out.println("Location:"+location);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Type:"+type);
		System.out.println("---------------------------");
	}
}