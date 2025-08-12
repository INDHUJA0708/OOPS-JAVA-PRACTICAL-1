// Example: Demonstrating Class, Object, Member Variables, and Functions
public class CarDemo {

    // Car class
    static class Car {
        // Member variables (fields)
        String brand;
        String color;
        int speed;

        // Member function to set details
        void setDetails(String b, String c, int s) {
            brand = b;
            color = c;
            speed = s;
        }
 
        // Member function to display details
        void displayDetails() {
            System.out.println("Car Brand: " + brand);
            System.out.println("Car Color: " + color);
            System.out.println("Car Speed: " + speed + " km/h");
            System.out.println("---------------------------");
        }

        // Member function to accelerate
        void accelerate(int increase) {
            speed += increase;
            System.out.println(brand + " accelerated to " + speed + " km/h");
        }
    }

    public static void main(String[] args) {
        // Creating first object
        Car car1 = new Car();
        car1.setDetails("Toyota", "Red", 80);
        car1.displayDetails();
        car1.accelerate(20);

        // Creating second object
        Car car2 = new Car();
        car2.setDetails("Honda", "Blue", 60);
        car2.displayDetails();
        car2.accelerate(15);
    }
}
