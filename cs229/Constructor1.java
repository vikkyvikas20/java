class Box
{
	double length,width,height;
	
	Box(double length,double width,double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
    
	double CalculateVolume()
	{
	return length*width*height;
	}
	double CalculateSurface()
	{
		return 2*(length*width+width*height+height*length);
	}

	void displayDetails()
	{
		System.out.println("boxedimenstion:"+length+"x"+width+"x"+height);
		System.out.println("Volume:"+CalculateVolume());
	}
}

public class Constructor1
{
	public static void main(String[]args)
	{
	
	Box Box1=new Box(1,2,3);


	Box1.displayDetails();

	}
}																									   
