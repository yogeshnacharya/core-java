class Library 
{
//properties

    String libraryName;
    String location;
    int numberOfBooks;
    int numberOfStaff;
    String librarian;
    double fee;
    String type;
    boolean hasDigitalSection;
    boolean hasReadingHall;
    int establishedYear;

    static String country="India";
    static String category="Public";

//behaviours

    public String issueBook(String book)
	{
		System.out.println("Issue: "+book);
		return book; 
	}
    public int returnBook(int id)
	{
		System.out.println("Return: "+id);
		return id; 
	}
    public String assignStaff(String name)
	{
		System.out.println("Staff: "+name);
		return name;
	}
    public double collectFee(double fee)
	{
		System.out.println("Fee: "+fee);
		return fee; 
	}
    public boolean openLibrary(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean conductEvent(boolean status)
	{
		System.out.println("Event: "+status);
		return status; 
	}
    public String announceHoliday(String holiday)
	{
		System.out.println("Holiday: "+holiday);
		return holiday; 
	}
    public int totalBooks(int count)
	{
		System.out.println("Books: "+count);
		return count; 
	}
    public String organizeSeminar(String sem)
	{
		System.out.println("Seminar: "+sem);
		return sem; 
	}
    public boolean maintainSilence(boolean status)
	{
		System.out.println("Silence: "+status);
		return status; 
	}
}