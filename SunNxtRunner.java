class  SunNxtRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String Seena=SunNxt.loginAndlogout(9095966769L,"Seena@1234","Srinivas","Seena_26");
System.out.println(Seena);
System.out.println("------Second time method call------");
boolean result=SunNxt.validateRegisterFields(9095966769L,"Seena@1234","Srinivas","Seena_26");
System.out.println(result);
}
}