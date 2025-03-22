import java.util.Scanner;
public class totalPrice {
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter the quantity: ");
int quantity = input.nextInt();
System.out.println("Enter the price: ");
float price = input.nextFloat();
float total = quantity * price;
System.out.println("Total price before discount: " + total);
System.out.println("Enter the discount: ");
float discount = input.nextFloat();
float totalDiscount=(discount/100)*total;
float finalTotal = total-totalDiscount;
System.out.println("Total price after discount: " + finalTotal);
input.close();
}
}


