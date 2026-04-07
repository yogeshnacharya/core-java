class Hospital {
//properties
    String hospitalName;
    String location;
    int numberOfPatients;
    int numberOfDoctors;
    String headDoctor;
    double treatmentFee;
    String hospitalType;
    boolean hasICU;
    boolean hasAmbulance;
    int establishedYear;

    static String country = "India";
    static String serviceType = "Healthcare";

//behaviours
    public String admitPatient(String name)
	{
        System.out.println("Patient Admitted: " + name);
        return name;
    }

    public int dischargePatient(int id)
	{
        System.out.println("Patient Discharged: " + id);
        return id;
    }

    public String assignDoctor(String name)
	{
        System.out.println("Doctor Assigned: " + name);
        return name;
    }

    public double collectFee(double fee) 
	{
        System.out.println("Fee Collected: " + fee);
        return fee;
    }

    public boolean openICU(boolean status) 
	{
        System.out.println("ICU Open: " + status);
        return status;
    }

    public boolean conductSurgery(boolean status)
	{
        System.out.println("Surgery Done: " + status);
        return status;
    }

    public String announceHoliday(String holiday) 
	{
        System.out.println("Holiday: " + holiday);
        return holiday;
    }

    public int totalPatients(int count)
	{
        System.out.println("Total Patients: " + count);
        return count;
    }

    public String organizeCamp(String camp) 
	{
        System.out.println("Camp Organized: " + camp);
        return camp;
    }

    public boolean maintainHygiene(boolean status) 
	{
        System.out.println("Hygiene Maintained: " + status);
        return status;
    }
}