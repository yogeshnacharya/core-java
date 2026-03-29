class SocialMediaPostsRunner
{
	public static void main(String [] socialmedia)
	{
		SocialMediaPosts social=new SocialMediaPosts("yogeshnacharya","personal",19.6f,"12-4-2026","Instagram",100001,40001);
		SocialMediaPosts soc=new SocialMediaPosts();
		social.userName="yogeshnacharya";
	    social.content="personal";
	    social.views=19.6f;
	    social.postDate="12-4-2026";
	    social.platformName="Instagram";
	    social.noOfLikes=10000l;
	    social.noOfShares=4000l;
		social.getSocialMediaPostsDatas();
	}
}