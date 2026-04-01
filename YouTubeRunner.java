class YouTubeRunner
{
	public static void main(String [] youtube)
	{
		YouTube tube=new YouTube();
		boolean log=tube.login("Yogeshnacharya","Yogesh@2005");
		System.out.println(log);
		String msg=tube.login("yn85980@gmail.com","Yogesh@123","12WesV");
		System.out.println(msg);
		String msg1=tube.search("milana");
		System.out.println(msg1);
		String msg2=tube.search("milana","puneeth rajkumar");
		System.out.println(msg2);
	}
}