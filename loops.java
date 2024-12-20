
import java.util.Scanner;

class loop {
//! While loop

    static void Display(int num) {
        int i = 1;

        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + num * i);
            i++;
        }
    }
//!for loop

    static void Display2(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }

}

public class loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        loop obj = new loop();

        obj.Display(num);

    }
}
