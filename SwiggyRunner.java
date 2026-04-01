class SwiggyRunner
{
	public static void main(String [] swiggy)
	{
		Swiggy swig=new Swiggy();
		boolean login=swig.login("Yogesh789","Yogesh789");
		System.out.println(login);
		String msg=swig.login("Yogesh789@gmail.com","Yogesh789@mail","4F7uE");
		System.out.println(msg);
		String msg1=swig.order("Chicken Biriyani");
		System.out.println(msg1);
		String msg2=swig.order("Chicken Biriyani",2);
		System.out.println(msg2);
		String msg3=swig.order("Chicken Biriyani",150.0);
		System.out.println(msg3);
		String msg4=swig.order("Chicken Biriyani","Hoohally Restuarant");
		System.out.println(msg4);
		String msg5=swig.order("Chicken Biriyani",30.3f);
		System.out.println(msg5);
	}
}