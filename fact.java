
import java.util.Scanner;

class Factorial {

    void Display(int num) {
        int fact = 1;
        int temp = num;
        do {
            fact *= num;
            num--;
        } while (num > 0);
        System.out.println("Factorial of " + temp + " is: " + fact);

    }
}

public class fact {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        Factorial obj = new Factorial();
        obj.Display(num);
    }

}
