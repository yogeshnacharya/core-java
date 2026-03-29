class MobileRunner
{
	public static void main(String [] mobile)
	{
		Mobile mobi=new Mobile("Samsung","Galaxy S21",69999,4000,"Black",true);
		Mobile mob=new Mobile();
		mob.brand = "Samsung";
        mob.model = "Galaxy S21";
        mob.price = 69999;
        mob.battery = 4000;
        mob.color = "Black";
        mob.is5G = true;
		
		mob.getMobileDetails();
	}
}