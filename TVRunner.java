class TvRunner
{
	public static void main(String [] television)
	{
		Tv tvv=new Tv("LG",43,30000,"LED",true,1);
		Tv tv=new Tv();
		tv.brand = "LG";
        tv.size = 43;
        tv.price = 30000;
        tv.type = "LED";
        tv.smartTV = true;
        tv.warranty = 1;
		
		tv.getTvDetails();
	}
}