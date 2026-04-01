class Swiggy
{
	public boolean login(String username,String psw)
	{
		System.out.println("Invoking login using username :" +username+  " and password : " +psw);
		boolean isLogin=false;
		String regusername="Yogesh789";
		String regpsw="Yogesh@789";
		
		if(username == regusername && psw == regpsw)
		{
			isLogin=true;
		}
		else
		{
			isLogin=false;
		}
		return isLogin;
	}
	
	public String login(String emailId,String psw,String captcha)
	{
		System.out.println("Invoking login using email id :" +emailId+ " and password :" +psw);
		String msg=null;
		String regemailId="Yogesh789@gmail.com";
		String regpsw="Yogesh@mail789";
		
		if(emailId == regemailId && psw == regpsw)
		{
			msg="login successful";
		}
		else
		{
			msg="login failed";
		}
		return msg;
	}
	
	public String order(String foodName)
	{
		System.out.println("ordering food by food name :" +foodName);
		String msg=null;
		if(foodName!=null)
		{
			msg="ordered food by food name : " +foodName+ "is available";
		}
		return msg;
	}
	
	public String order(String foodName,int quantity)
	{
		System.out.println("ordering food by food name : " +foodName+ " and quantity : " +quantity);
		String msg=null;
		if(foodName!=null && quantity!=null)
		{
			msg="ordered food by food name : " +foodName+ " and quantity : " +quantity+ " is available";
		}
		return msg;
	}
	
	public String order(String foodName,double price)
	{
		System.out.println("ordering food by food name : " +foodName+ " and price : " +price);
		String msg=null;
		if(foodName!=null  && price!=null)
		{
			msg="ordered food by food name : " +foodName+  " and price : " +price+  "is available";
		}
		return msg;
	}
	
	public String order(String foodName,String restuarant)
	{
		System.out.println("ordering food by food name : " +foodName+ "and restuarant : " +restuarant);
		String msg=null;
		if(foodName!=null && restuarant!=null)
		{
			msg="ordered food by food name : " +foodName+ "and restuarant : " +restuarant+ " is available";
		}
		return msg;
	}
	
	public String order(String foodName,float deliveryTime)
	{
		System.out.println("ordering food by food name : " +foodName+  " and delivery time in minutes : " +deliveryTime);
		String msg=null;
		if(foodName!=null && deliveryTime!=null)
		{
			msg="ordering food by food name : " +foodName+  " and delivery time in minutes : " +deliveryTime+ " will be available and delivered";
		}
		return msg;
	}
}