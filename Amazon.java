class Amazon
{
	public boolean login(String username,String psw)
	{
		System.out.println("Invoking login using username :" +username+  " and password : " +psw);
		boolean isLogin=false;
		String regusername="Yogesh123";
		String regpsw="Yogesh@123";
		
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
		String regemailId="Yogesh123@gmail.com";
		String regpsw="Yogesh@mail123";
		
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
	
	public String searchProduct(String productName)
	{
		System.out.println("searching  product name by product : " +productName);
		String msg=null;
		
		if(productName!=null)
		{
			msg="searched product : " +productName+ "is available";
		}
		return msg;
	}
	
	public String searchProduct(String productName,String category)
	{
		System.out.println("searching product by product name : " +productName+ "and category :" +category);
		String msg=null;
	if(productName!=null && category!=null)
		{
			msg="searched product name : " +productName+ " and category : " +category+ " is available";
		}
		return msg;
	}
	
	public String searchProduct(String productName,double  productPrice)
	{
		System.out.println("searching product by product name : " +productName+  " and product price " +productPrice);
		String msg=null;
		if(productName!=null && productPrice!=null)
		{
			msg="searched product by product name : " +productName+  " and product price " +productPrice+ " is available";
		}
		return msg;
	}
	public String searchProduct(String productName, int productId)
	{
		System.out.println("searching product by product name : " +productName+ "and product id : " +productId);
		String msg=null;
		if(productName!=null && productId!=null)
		{
			msg="searched product by product name : " +productName+  " and product id : " +productId+ " is available";
		}
		return msg;
	}
	
	public String searchProduct(String productName,float rating,String category)
	{
		System.out.println("searching product by product name : " +productName+ " and product rating : " +rating+  " and product category : " +category);
		String msg=null;
		if(productName!=null && rating!=null && category!=null)
		{
			msg="searched product by product name : " +productName+  " , product rating : " +rating+  "and product category : " +category+ " is available";
		}
		return msg;
	}
}