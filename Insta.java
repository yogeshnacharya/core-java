class Insta{

 public void login(){
 System.out.println("Invoking login");
 }
 
 public void login(String faceBook){
 System.out.println("Invoking login Using Facebook :"+faceBook);
 }
 
 public void login(String userName,String psw){
 System.out.println("Invoking login using user name:"+userName+" and psw:"+psw);
 }
 
 public void login(long phno,String psw){
 System.out.println("Invoking login using Phone Number:"+phno+" and psw:"+psw);
 }	
}