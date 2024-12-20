
import java.util.Scanner;

class fib {

    int n;

    void Display(int n) {
        int a = 0, b = 1, c = 0;
        int i = 2;
        while (i <= n) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            i++;
        }

    }
}

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        fib obj = new fib();
        obj.Display(n);
    }
}
