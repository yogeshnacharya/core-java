class ChatsMenuRunner
{
	public static void main(String [] chats)
	{
		ChatsMenu ref=new ChatsMenu();
		ref.getChatsMenuDetails();
		
		ChatsMenu pradeep=new ChatsMenu();
		pradeep.checkChatsFoodByFoodName("Gobi Manchuri");
		pradeep.checkChatsFoodByFoodName("Pani Puri");
		pradeep.checkChatsFoodByFoodName("Dahi Puri");
		pradeep.checkChatsFoodByFoodName("French Fries");
		
		ChatsMenu lakshmi=new ChatsMenu();
		lakshmi.checkChatsFoodByFoodName("Mushroom Manchuri");
		lakshmi.checkChatsFoodByFoodName("Baby Corn Manchuri");
		lakshmi.checkChatsFoodByFoodName("Aloo puri");
		lakshmi.checkChatsFoodByFoodName("French Fries");
		
		ChatsMenu sanmangala=new ChatsMenu();
		sanmangala.checkChatsFoodByFoodName("Dahi Puri");
		sanmangala.checkChatsFoodByFoodName("Bhel Puri");
		sanmangala.checkChatsFoodByFoodName("Khara Puri");
		sanmangala.checkChatsFoodByFoodName("Dry Gobi Manchuri");
		double price=sanmangala.CheckChatsFoodPriceByFoodName("Dahi Puri");
		System.out.println("The Price is:"+price);
		double price1=sanmangala.CheckChatsFoodPriceByFoodName("Bhel Puri");
		System.out.println("The Price is:"+price1);
		double price2=sanmangala.CheckChatsFoodPriceByFoodName("Aloo Puri");
		System.out.println("The Price is:"+price2);
		double price3=sanmangala.CheckChatsFoodPriceByFoodName("French Fries");
		System.out.println("The Price is:"+price3);
		
		ChatsMenu venu =new ChatsMenu();
		venu.checkChatsFoodByFoodName("Pani Puri");
		venu.checkChatsFoodByFoodName("Masala Puri");
		venu.checkChatsFoodByFoodName("Gobi Manchuri");
		venu.checkChatsFoodByFoodName("Churmuri");
		
		ChatsMenu ganesh=new ChatsMenu();
		ganesh.checkChatsFoodByFoodName("Nippit Masala");
		ganesh.checkChatsFoodByFoodName("Dry Gobi Manchuri");
		ganesh.checkChatsFoodByFoodName("Baby Corn Manchuri");
		ganesh.checkChatsFoodByFoodName("French Fries");
	}
}