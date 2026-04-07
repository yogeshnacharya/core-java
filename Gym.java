class Gym 
{
	
//Properties

    String gymName;
    String location;
    int numberOfMembers;
    int numberOfTrainers;
    String headTrainer;
    double fee;
    String type;
    boolean hasCardio;
    boolean hasWeights;
    int establishedYear;

    static String country="India";
    static String category="Fitness";

//Behaviour

    public String enrollMember(String name)
	{
		System.out.println("Member: "+name);
		return name; 
	}
    public int removeMember(int id)
	{
		System.out.println("Removed: "+id);
		return id; 
	}
    public String assignTrainer(String name)
	{
		System.out.println("Trainer: "+name);
		return name; 
	}
    public double collectFee(double fee)
	{
		System.out.println("Fee: "+fee);
		return fee; 
	}
    public boolean openGym(boolean status)
	{
		System.out.println("Open: "+status);
		return status; 
	}
    public boolean conductWorkout(boolean status)
	{
		System.out.println("Workout: "+status);
		return status; 
	}
    public String announceOffer(String offer)
	{
		System.out.println("Offer: "+offer);
		return offer; 
	}
    public int totalMembers(int count)
	{
		System.out.println("Members: "+count);
		return count; 
	}
    public String organizeSession(String session)
	{
		System.out.println("Session: "+session);
		return session; 
	}
    public boolean maintainEquipment(boolean status)
	{
		System.out.println("Equipment: "+status);
		return status; 
	}
}