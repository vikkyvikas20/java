class Box
{
	double length,width,height;
	
	Box(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;
	}
	Box(){
		length=1;
		width=1;
		height=1;
	}
	Box(double l,double w)
	{
		length=l;
		width=w;
		height=1;
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

public class Constructor
{
	public static void main(String[]args)
	{
	Box Box5;
	Box Box1=new Box(1,2,3);
	Box5=Box1;
	Box Box2=new Box(3,4,6);
	Box Box3=new Box();
	Box Box4=new Box(2,3);

	Box1.displayDetails();
	Box2.displayDetails();
	Box3.displayDetails();
	Box4.displayDetails();
	}
}																									   