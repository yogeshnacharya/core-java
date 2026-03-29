class BikeDetails
{
static String bikeNames[]={"Splendor","Honda Activa","Shine","Jupiter","TVS","Bajaj"};
public static void main(String [] bikes)
{
for(int i=0;i<bikeNames.length;i++)
{
	if (i%2!=0){
System.out.println(bikeNames[i]);
}
}
}
}