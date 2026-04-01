class AmazonRunner
{
	public static void main(String [] amazon)
	{
		Amazon details=new Amazon();
		boolean  login=details.login("Yogesh456","Yogesh@456");
		System.out.println(login);
		String msg=details.login("Yogesh456@gmail.com","Yogesh456@mail","7Ytr3");
		System.out.println(msg);
		String msg1=details.searchProduct("laptop");
		System.out.println(msg1);
		String msg2=details.searchProduct("laptop","electronics");
		System.out.println(msg2);
		String msg3=details.searchProduct("laptop",24000);
		System.out.println(msg3);
		String msg4=details.searchProduct("laptop",1001);
		System.out.println(msg4);
		String msg5=details.searchProduct("laptop",4.5f,"electronics");
		System.out.println(msg5);
	}
}