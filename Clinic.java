class Clinic 
{
	
//Properties

    String name;
    String location;
    int numberOfPatients;
    int numberOfDoctors;
    String headDoctor;
    double fee;
    String type;
    boolean hasPharmacy;
    boolean hasLab;
    int establishedYear;

    static String country="India";
    static String category="Healthcare";

//Behaviour

    public String admitPatient(String name)
	{
		System.out.println("Patient: "+name);
		return name; 
	}
    public int dischargePatient(int id)
	{
		System.out.println("Discharge: "+id);
		return id; 
	}
    public String assignDoctor(String name)
	{
		System.out.println("Doctor: "+name);
		return name; 
	}
    public double collectFee(double fee)
	{
		System.out.println("Fee: "+fee);
		return fee; 
	}
    public boolean openClinic(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean conductCheckup(boolean status)
	{
		System.out.println("Checkup: "+status);
		return status; 
	}
    public String announceHoliday(String holiday)
	{
		System.out.println("Holiday: "+holiday);
		return holiday; 
	}
    public int totalPatients(int count)
	{
		System.out.println("Patients: "+count);
		return count; 
	}
    public String organizeCamp(String camp)
	{
		System.out.println("Camp: "+camp);
		return camp; 
	}
    public boolean maintainHygiene(boolean status)
	{
		System.out.println("Hygiene: "+status);
		return status;
	}
}