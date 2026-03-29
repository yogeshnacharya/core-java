class  TwitterRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String Chaluva=Twitter.loginAndlogout(9085966769L,"Challu@1234","Chaluvaraju","Chaluva_14");
System.out.println(Chaluva);
System.out.println("------Second time method call------");
boolean result=Twitter.validateRegisterFields(9085966769L,"Challu@1234","Chaluvaraju","Chaluva_14");
System.out.println(result);
}
}