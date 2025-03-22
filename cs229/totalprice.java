import java.util.Scanner;
public class totalprice {
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the quantity: ");
int quantity = input.nextInt();
System.out.println("Enter the price: ");
float unitPrice = input.nextFloat();
double totalPrice = quantity * unitPrice;
System.out.println("Total without discount: " + totalPrice);


input.close();
}
}