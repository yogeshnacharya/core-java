class  WhatsAppRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String kushal =WhatsApp.loginAndlogout(9867646789L,"kushal@1234","Kushal Gowda H V","Kushal_Gowda");
System.out.println(kushal);
System.out.println("------Second time method call------");
boolean result=WhatsApp.validateRegisterFields(9867646789L,"kushal@1234","Kushal Gowda H V","Kushal_Gowda");
System.out.println(result);
}
}