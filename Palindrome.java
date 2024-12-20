
import java.util.Scanner;

class pali {

    int result = 0;

    void Display(int num) {

        int temp = num;
        while (num > 0) {
            result = result * 10 + num % 10;
            num = num / 10;

        }
        if (result == temp) {
            System.out.println(temp + " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");

        }

    }

}

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        pali obj = new pali();
        obj.Display(num);
    }
}
