
import java.util.Scanner;

class Pat {

    void Display1(int num) {

        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    void Display2(int num) {

        int i = num;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

    }

    // pyramid pattern
    void Display3(int num) {

        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= num - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }

    }

    void Display4(int num) {

        int i = num-1;
        while (i >= 1) {
            int j = 1;
            while (j <= num - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i--;
        }

    }
// square pattern
    void Display5(int num) {

        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= num) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
    void Display6(int num) {

        int i = 1;
        while (i <= num-1) {
            int j = 1;
            while (j <= num - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        //int i = num-1;
        while (i >= 1) {
            int j = 1;
            while (j <= num - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i--;
        }

    }






}

public class patterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        Pat p = new Pat();
        // p.Display1(num);
        p.Display6(num);
    }
}
