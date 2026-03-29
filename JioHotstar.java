class JioHotstar
{
public static String loginAndlogout(long mobileNumber,String pasw,String fullName,String userName)
 {
  System.out.println("loginAndlogout process is started");
  String loginStatus=null;
if(mobileNumber !=0 ||  pasw!=null || fullName !=null || userName != null)
   {
if (pasw.length()>0 || fullName.length()>4 || userName.length()>4)
{
    loginStatus= "Thank you "+fullName+" login successfully";
  }
  else
  {

   loginStatus="please check the length of PSW,FullName,userName";
}
}else{

    loginStatus="please enter the valid Data";
}
 System.out.println("loginAndlogout Process is ended");

 return loginStatus;
 }
public static boolean validateRegisterFields(long mobileNumber,String pasw,String fullName,String userName)
{
	System.out.println("validateRegisterFields is started");
	boolean isValidate=false;
	if (mobileNumber!=0)
	{
		isValidate=true;
	}
	if(pasw!=null)
	{
		isValidate=true;
	}
	if(fullName!=null)
	{
		isValidate=true;
	}
	if(userName!=null)
	{
		isValidate=true;
	}
	System.out.println("validateRegisterFields is started");
	return isValidate;
}
}