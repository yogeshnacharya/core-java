class TabletRunner
{
	public static void main(String [] tablet)
	{
		Tablet tabl=new Tablet("Apple","ipad",45000,128,"Silver",true);
		Tablet lap=new Tablet();
		lap.brand = "Apple";
		lap.model = "iPad";
		lap.price = 45000;
		lap.storage = 128;
		lap.color = "Silver";
		lap.supportsPen = true;
		
		lap.getTabletDetails();
	}
}