class SocialMediaPosts
{
	String userName;
	String content;
	float views;
	String postDate;
	String platformName;
	long noOfLikes;
	long noOfShares;
	
	public SocialMediaPosts(String userName,String content,float views,String postDate,String platformName,long noOfLikes,long noOfShares)
	{
		System.out.println("I am socialmediaposts constructors with parameter:"+ userName);
		System.out.println("I am socialmediaposts constructors with parameter:"+ content);
		System.out.println("I am socialmediaposts constructors with parameter:"+ views);
		System.out.println("I am socialmediaposts constructors with parameter:"+ postDate);
		System.out.println("I am socialmediaposts constructors with parameter:"+ platformName);
		System.out.println("I am socialmediaposts constructors with parameter:"+ noOfLikes);
		System.out.println("I am socialmediaposts constructors with parameter:"+ noOfShares);
		
	}
	
    public SocialMediaPosts()
	{
		System.out.println("I am SocialMediaPosts Constructor without parameter");
	}
	
	public void getSocialMediaPostsDatas()
	{
		System.out.println("Username:"+userName);
		System.out.println("Content:"+content);
		System.out.println("Views:"+views);
		System.out.println("Post Date:"+postDate);
		System.out.println("Platform Name:"+platformName);
		System.out.println("No Of Likes:"+noOfLikes);
		System.out.println("No Of Shares:"+noOfShares);
	}
}