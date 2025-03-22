// Source code is decompiled from a .class file using FernFlower decompiler.
class Box {
    double length;
    double width;
    double height;
 
    Box(double l, double w, double h) {
       length = l;
       width = w;
       height = h;
    
    }
    Boolean equals(Box o)
    {
    if(o.length == this.length &&
       o.width == this.width &&
       o.height == this.height)
       return true;
    else
        return false;
    }   
}
public class box2
{
	public static void main(String[]args)
	{
	Box Box1 = new Box(1,2,3);
	Box Box2 = new Box(3,4,6);
	Box Box3 = new Box(1,2,3);
    if(Box3.equals(Box1))
        System.out.println("Box3 and Box1 are same");
    else 
        System.out.println("Box3 and Box1 are different");
    if(Box2.equals(Box1))
        System.out.println("Box2 and Box1 are same");
    else
    System.out.println("Box2 and Box1 are different");
	}
}