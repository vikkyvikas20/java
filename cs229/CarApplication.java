import java.util.Scanner;

class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Constructor
    public Car(String brand, String model, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Method to accelerate the car
    public void accelerate(int incrementSpeed) {
        if (incrementSpeed >= 0) {
            speed += incrementSpeed;
            System.out.println("The car has accelerated. New speed: " + speed + " km/h");
        } else {
            System.out.println("Invalid Speed");
            System.exit(0);
        }
    }
}

// Rename this class to avoid conflict
public class CarApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Car object
        Car car = new Car("Toyota", "Fortuner", 2016, 60);

        // Display car details before acceleration
        System.out.println("Car details before acceleration:");
        car.displayInfo();
        System.out.println();

        // Get speed increment from the user
        System.out.print("Enter speed increment: ");
        int increment = sc.nextInt();

        // Accelerate the car
        car.accelerate(increment);
        System.out.println();

        // Display car details after acceleration
        System.out.println("Car details after acceleration:");
        car.displayInfo();

        // Close the scanner
        sc.close();
    }
}
