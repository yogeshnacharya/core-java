class LibraryRunner
{
	public static void main(String[] args)
	{
		Library l1 = new Library("City Library","Suman","Bangalore","City Corporation","Public");
		l1.displayLibraryDetails();
		
		Library l2 = new Library("National Library","Ravi Kumar","Delhi","Government","Reference");
		l2.displayLibraryDetails();
		
		Library l3 = new Library("Central Library","Anita","Mumbai","Municipal Corp","Public");
		l3.displayLibraryDetails();
		
		Library l4 = new Library("State Library","Kiran","Hyderabad","State Govt","Academic");
		l4.displayLibraryDetails();
		
		Library l5 = new Library("University Library","Meena","Chennai","University","Educational");
		l5.displayLibraryDetails();
		
		Library l6 = new Library("Digital Library","Arjun","Pune","Private","E-Library");
		l6.displayLibraryDetails();
		
		Library l7 = new Library("Community Library","Pooja","Kolkata","NGO","Public");
		l7.displayLibraryDetails();
		
		Library l8 = new Library("Kids Library","Rahul","Bangalore","Private","Children");
		l8.displayLibraryDetails();
		
		Library l9 = new Library("Research Library","Sneha","Delhi","Research Org","Research");
		l9.displayLibraryDetails();
		
		Library l10 = new Library("Public Reading Room","Vikas","Jaipur","Municipality","General");
		l10.displayLibraryDetails();
	}
}