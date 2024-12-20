
class Vehicles {

    String carName;
    int carModel;
    int carSpeed;

    void display() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Speed: " + carSpeed);
    }
}

public class ClassAndObjects {

    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles();
        vehicle.carName = "Toyota";
        vehicle.carModel = 2021;
        vehicle.carSpeed = 100;
        vehicle.display();
    }

}
