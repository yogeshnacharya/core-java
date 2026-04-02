class Library
{
	String libraryName;
	String librarianName;
	static int noOfBooks=1000;
	String location;
	String ownerName;
	String category;
	
	public Library()
	{
		
	}
	public Library(String libraryName,String librarianName,String location,String ownerName,String category)
	{
		this.libraryName=libraryName;
		this.librarianName=librarianName;
		this.location=location;
		this.ownerName=ownerName;
		this.category=category;
	}
	public void displayLibraryDetails()
	{
		System.out.println("Library Name:"+libraryName);
		System.out.println("Librarian Name:"+librarianName);
		System.out.println("No Of Books:"+noOfBooks);
		System.out.println("Location:"+location);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Category:"+category);
		System.out.println("---------------------------");
	}
}