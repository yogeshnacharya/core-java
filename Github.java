class Github
{
	Github()
	{
		this("Repository");
		System.out.println("I am Github Constructor 1");
	}

	Github(String repoName)
	{
		this("Repository","Yogesh");
		System.out.println("I am Github Constructor 2");
		System.out.println("Repo Name:"+repoName);
	}

	Github(String repoName,String userName)
	{
		this("Repository",10.0);
		System.out.println("I am Github Constructor 3");
		System.out.println("Repo Name:"+repoName);
		System.out.println("User Name:"+userName);
	}

	Github(String repoName,double size)
	{
		this("Repository",4.8f);
		System.out.println("I am Github Constructor 4");
		System.out.println("Repo Name:"+repoName);
		System.out.println("Size:"+size);
	}

	Github(String repoName,float rating)
	{
		System.out.println("I am Github Constructor 5");
		System.out.println("Repo Name:"+repoName);
		System.out.println("Rating:"+rating);
	}
}