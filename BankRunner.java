class BankRunner
{
	public static void main(String[] args)
	{
		Bank b1 = new Bank("State Bank of India","Rajesh Kumar","Mumbai","Government","Savings");
		b1.displayBankDetails();
		
		Bank b2 = new Bank("HDFC Bank","Anita Sharma","Delhi","HDFC Ltd","Current");
		b2.displayBankDetails();
		
		Bank b3 = new Bank("ICICI Bank","Rohit Verma","Bangalore","ICICI Group","Savings");
		b3.displayBankDetails();
		
		Bank b4 = new Bank("Axis Bank","Pooja Mehta","Chennai","Axis Ltd","Current");
		b4.displayBankDetails();
		
		Bank b5 = new Bank("Punjab National Bank","Amit Singh","Punjab","Government","Savings");
		b5.displayBankDetails();
		
		Bank b6 = new Bank("Canara Bank","Suresh Rao","Mangalore","Government","Current");
		b6.displayBankDetails();
		
		Bank b7 = new Bank("Bank of Baroda","Neha Patel","Ahmedabad","Government","Savings");
		b7.displayBankDetails();
		
		Bank b8 = new Bank("Kotak Mahindra Bank","Kiran Shah","Mumbai","Kotak Group","Current");
		b8.displayBankDetails();
		
		Bank b9 = new Bank("Yes Bank","Vikas Gupta","Delhi","Yes Group","Savings");
		b9.displayBankDetails();
		
		Bank b10 = new Bank("IndusInd Bank","Ravi Nair","Hyderabad","IndusInd Ltd","Current");
		b10.displayBankDetails();
	}
}