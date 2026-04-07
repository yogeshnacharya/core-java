class College 
{
// properties
    String collegeName;
    String location;
    int numberOfStudents;
    int numberOfProfessors;
    String principalName;
    double collegeFee;
    String universityAffiliation;
    boolean hasLibrary;
    boolean hasHostel;
    int establishedYear;

    static String country = "India";
    static String educationType = "Higher Education";

//behaviours
    public String conductLecture(String subject) 
	{
        System.out.println("Conducting Lecture: " + subject);
        return subject;
    }

    public int admitStudent(int count)
	{
        System.out.println("Students Admitted: " + count);
        return count;
    }

    public String assignProfessor(String name)
	{
        System.out.println("Assigned Professor: " + name);
        return name;
    }

    public double collectFee(double amount) 
	{
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean openLibrary(boolean status) 
	{
        System.out.println("Library Open: " + status);
        return status;
    }

    public boolean conductExam(boolean status)
	{
        System.out.println("Exam Conducted: " + status);
        return status;
    }

    public String announceHoliday(String holiday) 
	{
        System.out.println("Holiday: " + holiday);
        return holiday;
    }

    public int totalStudents(int count) 
	{
        System.out.println("Total Students: " + count);
        return count;
    }

    public String organizeEvent(String event)
	{
        System.out.println("Event: " + event);
        return event;
    }

    public boolean maintainDiscipline(boolean status) 
	{
        System.out.println("Discipline: " + status);
        return status;
    }
}