class Bank
{
	String bankName;
	String managerName;
	static int noOfEmployees=30;
	String branch;
	String ownerName;
	String accountType;
	
	public Bank()
	{
		
	}
	public Bank(String bankName,String managerName,String branch,String ownerName,String accountType)
	{
		this.bankName=bankName;
		this.managerName=managerName;
		this.branch=branch;
		this.ownerName=ownerName;
		this.accountType=accountType;
	}
	public void displayBankDetails()
	{
		System.out.println("Bank Name:"+bankName);
		System.out.println("Manager Name:"+managerName);
		System.out.println("No Of Employees:"+noOfEmployees);
		System.out.println("Branch:"+branch);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Account Type:"+accountType);
		System.out.println("---------------------------");
	}
}