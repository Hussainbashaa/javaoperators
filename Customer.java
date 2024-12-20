
class Person {

    String fname;
    String lname;
    int pnumber;
    String email;
    int age;

    void display() {
        System.out.println("-------------------------------------");
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Phone Number: " + pnumber);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("-------------------------------------");

    }

}

public class Customer {

    public static void main(String[] args) {
        Person p = new Person();
        p.fname = "John";
        p.lname = "Doe";
        p.pnumber = 1234567890;
        p.email = "johndoe@gmail.com";
        p.age = 25;
        p.display();
    }

}
