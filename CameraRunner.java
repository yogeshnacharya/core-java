class CameraRunner
{
	public static void main(String [] camera)
	{
		Camera came=new Camera("Canon","DSLR",60000,24,true,"Black");
		Camera cam=new Camera();
		cam.brand = "Canon";
		cam.type = "DSLR";
		cam.price = 60000;
		cam.megapixels = 24;
		cam.wifi = true;
		cam.color = "Black";
		
		cam.getCameraDetails();
	}
}