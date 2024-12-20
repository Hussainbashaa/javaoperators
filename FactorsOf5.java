
import java.util.Scanner;

class F {
//!Displaying numbers without multiples of 5

    void Display1(int num) {
        System.out.println("----------------------------- ");

        System.out.println("Displaying numbers without multiples of 5:");

        for (int i = 0; i <= num; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.print(" " + i);
        }
        System.out.println(" ");

    }
//! printing half range of given numbers

    void Display2(int num) {
        System.out.println("----------------------------- ");

        System.out.println("Half range of given numbers:");

        for (int i = 1; i <= num; i++) {
            if (i == (num / 2) + 1) {

                break;
            }
            System.out.print(" " + i);

        }
        System.out.println(" ");

    }
//!Displaying numbers without multiples of 5 in half Range of given number

    void Display3(int num) {
        System.out.println("----------------------------- ");

        System.out.println("Displaying numbers without multiples of 5 in half Range of given number:");

        for (int i = 0; i <= num; i++) {

            if (i == (num / 2) + 1) {
                break;
            }
            if (i % 5 == 0) {

                continue;
            }
            System.out.print(" " + i);

        }

    }

}

public class FactorsOf5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        F obj = new F();
        obj.Display1(num);
        obj.Display2(num);
        obj.Display3(num);
        scanner.close();
    }
}
