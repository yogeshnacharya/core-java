class  NetflixRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String Sanjana =Netflix.loginAndlogout(9859636789L,"Sanjana@1234","Sanjana A","Sanjana_A");
System.out.println(Sanjana);
System.out.println("------Second time method call------");
boolean result=Netflix.validateRegisterFields(9859636789L,"Sanjana@1234","Sanjana A","Sanjana_A");
System.out.println(result);
}
}