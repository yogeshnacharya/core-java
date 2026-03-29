class JuiceMenuRunner
{
	public static void main(String [] juice)
	{
		JuiceMenu ref=new JuiceMenu();
		ref.JuiceMenuDetails();
		
		JuiceMenu arkeshwara=new JuiceMenu();
		arkeshwara.checkJuiceByJuiceName("Apple Juice");
		arkeshwara.checkJuiceByJuiceName("Mango Juice");
		arkeshwara.checkJuiceByJuiceName("Oreo Juice");
		arkeshwara.checkJuiceByJuiceName("Guava Juice");
		
		JuiceMenu byraveshwara=new JuiceMenu();
		byraveshwara.checkJuiceByJuiceName("Banana Juice");
		byraveshwara.checkJuiceByJuiceName("Pineapple Juice");
		byraveshwara.checkJuiceByJuiceName("Strawberry Juice");
		byraveshwara.checkJuiceByJuiceName("Mango Juice");
		
		JuiceMenu centuron=new JuiceMenu();
		centuron.checkJuiceByJuiceName("Coconut Juice");
		centuron.checkJuiceByJuiceName("Karbuja Juice");
		centuron.checkJuiceByJuiceName("Chickoo Juice");
		centuron.checkJuiceByJuiceName("Orange Juice");
		
		JuiceMenu delicious=new JuiceMenu();
		delicious.checkJuiceByJuiceName("Apple Juice");
		delicious.checkJuiceByJuiceName("Butter Scotch Juice");
		delicious.checkJuiceByJuiceName("Jack Fruit Juice");
		delicious.checkJuiceByJuiceName("Grapes Juice");
		double price=delicious.CheckJuicePriceByJuiceName("Apple Juice");
		System.out.println("The Price is:"+price);
		double price1=delicious.CheckJuicePriceByJuiceName("Karbuja Juice");
		System.out.println("The Price is:"+price1);
		double price2=delicious.CheckJuicePriceByJuiceName("Chickoo Juice");
		System.out.println("The Price is:"+price2);
		double price3=delicious.CheckJuicePriceByJuiceName("Orange Juice");
		System.out.println("The Price is:"+price3);
		
		JuiceMenu estward=new JuiceMenu();
		estward.checkJuiceByJuiceName("Pineapple Juice");
		estward.checkJuiceByJuiceName("Grapes Juice");
		estward.checkJuiceByJuiceName("Guava Juice");
		estward.checkJuiceByJuiceName("Oreo Juice");
	}
}