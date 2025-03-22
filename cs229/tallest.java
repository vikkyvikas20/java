import java.util.Scanner;
public class tallest {
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter the heights of 3 students: ");
float height1 = input.nextFloat();
float height2 = input.nextFloat();
float height3 = input.nextFloat();
if (height1 > height2){
if(height1 > height3){
System.out.println("Student 1 is tallest");
}
else{
System.out.println("Student 3 is tallest");
}
}
else{
if(height2 > height3){
System.out.println("Student 2 is tallest");
}
else{
System.out.println("Student 3 is tallest");
}
}
input.close();
}
}