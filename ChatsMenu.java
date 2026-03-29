class ChatsMenu
{
	public void getChatsMenuDetails()
	{
		System.out.println("Getting Chats Menu Details");
	}
	public void checkChatsFoodByFoodName(String chatsFoodName)
	{
		System.out.println("Checking Chats Food by Food Name");
		if(chatsFoodName=="Gobi Manchuri")
		{
			System.out.println("Chats Food Available");
		}
		else if(chatsFoodName=="Dry Gobi Manchuri")
		{
			System.out.println("Chats Food Available");
		}
		else if(chatsFoodName=="Mushroom Manchuri")
		{
			System.out.println("Chats Food Available");
		}
		else if(chatsFoodName=="Baby Corn Manchuri")
		{
			System.out.println("Chats Food Available");
		}
		else if(chatsFoodName=="Panipuri")
		{
			System.out.println("Chats Food Available");
		}
		else if(chatsFoodName=="Masala Puri")
		{
			System.out.println("Chats Food Available");
		}
		else if (chatsFoodName=="Dahi Puri")
		{
			System.out.println("Chats Food Available");
		}
		else if(chatsFoodName=="Sev Puri")
		{
			System.out.println("Chats Food Available");
		}
		else if(chatsFoodName=="Aloo puri")
		{
			System.out.println("Chats Food Available");
		}
		else if (chatsFoodName=="French Fries")
		{
			System.out.println("Chats Food Available");
		}
		else
		{
			System.out.println("Chats Foods Not Available");
		}
	}
	public double CheckChatsFoodPriceByFoodName(String chatsFoodName)
	{
		System.out.println ("Invoking CheckChatsFoodPriceByFoodName:"+chatsFoodName);
		
		double chatsFoodPrice=0.0;
		if(chatsFoodName=="Gobi Manchuri")
		{
			chatsFoodPrice=40.1;
		}
		else if(chatsFoodName=="Dry Gobi Manchuri")
		{
			chatsFoodPrice=50.3;
		}
		else if(chatsFoodName=="PaniPuri")
		{
			chatsFoodPrice=30.2;
		}
		else if(chatsFoodName=="French Fries")
		{
			chatsFoodPrice=55.3;
		}
		else
		{
			System.out.println(chatsFoodName + " is not available");
		}
		return chatsFoodPrice;
	}
}