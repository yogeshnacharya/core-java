class  SpotifyRunner{
public static void main(String []args){
System.out.println("------First time method call------");
String Niranjan =Spotify.loginAndlogout(9869636789L,"Niranjan@1234","Niranjan K N","Niranjan_K_N");
System.out.println(Niranjan);
System.out.println("------Second time method call------");
boolean result=Spotify.validateRegisterFields(9869636789L,"Niranjan@1234","Niranjan K N","Niranjan_K_N");
System.out.println(result);
}
}