class AmazonProduct
{
static float productPrice[]={19999.6f,20346.8f,78459.1f,12409.8f,66758.1f};
static String productNames[]={"oppo A16k","Haier Refrigerator","Apple Laptop","vivo v15 phone","Samsung LED TV"};
static float productRatings[]={4.6f,3.9f,4.9f,4.8f,5.6f};
public static void getAmazonProductNames()
{
for(int index=0;index<productNames.length;index++)
{
System.out.println("product Name:"+productNames[index]);
System.out.println("product price:"+productPrice[index]);
System.out.println("product Ratings:"+productRatings[index]);
}
}
}
