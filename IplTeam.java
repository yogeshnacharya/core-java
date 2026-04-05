class IplTeam
{
 String teamName;
 static int noOfPlayers=11;
 String ownerName;
 String captainName;

 public IplTeam()
 {
	System.out.println("Running no argument constructors in ipl team");
 }
  
 public IplTeam(String teamName,String ownerName,String captainName)
 {
  this.teamName=teamName;
  this.ownerName=ownerName;
  this.captainName=captainName;
 }

 public void displayIplTeamDetails()
 {
  System.out.println("Team Name:"+teamName);
  System.out.println("Owner Name:"+ownerName);
  System.out.println("No of Players:"+noOfPlayers);
  System.out.println("Captain Name:"+captainName);
  }

}

