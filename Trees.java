class Trees
{

    Trees() 
	{
        this("Mango Tree");
        System.out.println("I am Trees Constructor 1");
    }

    Trees(String name) 
	{
        this("Mango Tree", "India");
        System.out.println("I am Trees Constructor 2");
        System.out.println("Name: " + name);
    }

    Trees(String name, String location) 
	{
        this("Mango Tree", 20.5);
        System.out.println("I am Trees Constructor 3");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }

    Trees(String name, double height) 
	{
        this("Mango Tree", 4.8f);
        System.out.println("I am Trees Constructor 4");
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
    }

    Trees(String name, float rating) 
	{
        System.out.println("I am Trees Constructor 5");
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
    }
}

