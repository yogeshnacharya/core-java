class  FacebookRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String vidya =Facebook.loginAndlogout(9867546789L,"vidya@1234","Vidyashree H S","vidya_shivu_gowda");
System.out.println(vidya);
System.out.println("------Second time method call------");
boolean result=Facebook.validateRegisterFields(9867546789L,"vidya@1234","Vidyashree H S","vidya_shivu_gowda");
System.out.println(result);
}
}