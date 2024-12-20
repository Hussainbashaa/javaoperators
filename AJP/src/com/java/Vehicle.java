package ajp.src.com.java;

class vehicle {

    String color;
    int speed;
    int size;
    String model;
    String company;
    String type;
    String fuelType;
    int price;

    void setCarValues(String c, int s, int si, String m, String com, String t, String f, int p) {
        color = c;
        speed = s;
        size = si;
        model = m;
        company = com;
        type = t;
        fuelType = f;
        price = p;
    }

    void displayCarDetails() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Size: " + size);
        System.out.println("Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("Type: " + type);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: " + price);
    }

}

public class Vehicle {

    public static void main(String[] args) {
        vehicle car = new vehicle();
        car.setCarValues("Red", 120, 5, "Audi", "Audi", "SUV", "Petrol", 5000000);
        car.displayCarDetails();
    }
}
