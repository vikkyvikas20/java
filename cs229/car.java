import java.util.Scanner;

class Car {
private String brand;
private String model;
private int year;
private int speed;

public Car(String brand, String model, int year, int speed) {
this.brand = brand;
this.model = model;
this.year = year;
this.speed = speed;
}

public void displayInfo() {
System.out.println("Brand: " + brand);
System.out.println("Model: " + model);
System.out.println("Year: " + year);
System.out.println("Speed: " + speed + " km/h");
}

public void accelerate(int incrementSpeed) {
if (incrementSpeed >= 0) {
speed += incrementSpeed;
System.out.println("The car has accelerated. New speed: " + speed + " km/h");
} 
else 
{
System.out.println("Invalid Speed");
System.exit(0);
}
}
}

public class Car {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Car car = new Car("Toyota", "Fortuner", 2016, 60);

System.out.println("Car details before acceleraƟon:");
car.displayInfo();
System.out.println();

System.out.print("Enter speed increment: ");
int increment = sc.nextInt();

car.accelerate(increment);
System.out.println();

System.out.println("Car details aŌer acceleraƟon:");
car.displayInfo();

sc.close();
}
}

