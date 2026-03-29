class  SnapChatRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String Sanika =SnapChat.loginAndlogout(9869646789L,"Sanika@1234","Sanika M","Sanika_M");
System.out.println(Sanika);
System.out.println("------Second time method call------");
boolean result=SnapChat.validateRegisterFields(9869646789L,"Sanika@1234","Sanika M","Sanika_M");
System.out.println(result);
}
}