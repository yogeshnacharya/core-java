class  JioHotstarRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String yogesh =JioHotstar.loginAndlogout(9867643278l,"yogesh@1234","yogesh N","Yogesh_N");
System.out.println(yogesh);
System.out.println("------Second time method call------");
boolean result=Instagram.validateRegisterFields(9867643278l,"yogesh@1234","yogesh N","Yogesh_N");
System.out.println(result);
}
}