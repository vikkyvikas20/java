class Box{
	double length,width,height;
	
	Box(double l,double w,double h){
		length=l;
		width=w;
		height=h;
	}
	
	double calculateVolume(){
	return length*width*height;
	}

	void displayDetails(){
		system.out.println("boxedimenstion:"+length+"x"+width+"x"+height);
		system.out.println("volume:"+calculateVolume());
	}
}

public class BoxExample{
	public static void main(string[]args){
	Box Box1=newBox(1,2,3);
	Box Box2=newBox(3,4,6);
	Box1.displayDetails();
	Box2.displayDetails();
	system.out.println("box 1 Volume"+Box1.Calculate());
	system.out.println("box 2 Volume"+Box2.Calculate());
	}
}