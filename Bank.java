class Bank 
{
//properties

    String bankName;
    String location;
    int numberOfAccounts;
    int numberOfEmployees;
    String manager;
    double balance;
    String type;
    boolean hasATM;
    boolean hasLoanService;
    int establishedYear;

    static String country="India";
    static String sector="Finance";

//behaviours

    public String openAccount(String name)
	{
		System.out.println("Account: "+name);
		return name;		
	}
    public int closeAccount(int id)
	{
		System.out.println("Closed: "+id);
		return id; 
	}
    public String assignManager(String name)
	{
		System.out.println("Manager: "+name);
		return name;
	}
    public double deposit(double amt)
	{
		System.out.println("Deposit: "+amt);
		return amt; 
	}
    public boolean withdraw(boolean status)
	{
		System.out.println("Withdraw: "+status);
		return status; 
	}
    public boolean approveLoan(boolean status)
	{
		System.out.println("Loan: "+status);
		return status;
		}
    public String announceOffer(String offer)
	{
		System.out.println("Offer: "+offer);
		return offer; 
	}
    public int totalAccounts(int count)
	{
		System.out.println("Accounts: "+count);
		return count; 
	}
    public String organizeMeeting(String meeting)
	{
		System.out.println("Meeting: "+meeting);
		return meeting; 
	}
    public boolean maintainSecurity(boolean status)
	{
		System.out.println("Security: "+status);
		return status; 
	}
}