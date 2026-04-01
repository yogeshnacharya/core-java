class FlipkartRunner
{
	public static void main(String [] flipkart)
	{
		Amazon det=new Amazon();
		boolean login=det.login("Yogesh456","Yogesh@456");
		System.out.println(login);
		String msg=det.login("Yogesh456@gmail.com","Yogesh456@mail","Xku8o1");
		System.out.println(msg);
		String msg1=det.searchProduct("mobile");
		System.out.println(msg1);
		String msg2=det.searchProduct("mobile","accessories");
		System.out.println(msg2);
		String msg3=det.searchProduct("mobile",34560);
		System.out.println(msg3);
		String msg4=det.searchProduct("mobile",1065);
		System.out.println(msg4);
		String msg5=det.searchProduct("mobile",4.2f,"accessories");
		System.out.println(msg5);
	}
}