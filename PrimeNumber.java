
class prime {

//! prime number or not
    void Display(int num) {
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(+num + "<---(Not a prime number)");
                break;
            }
        }
        if (i == num) {
            System.out.println(+num + " <---(is a Prime number)");
        }
    }
//! prime number in given range

    void Display2(int num) {
        for (int i = 2; i <= num; i++) {
            int j;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);

            }
        }
    }

}

public class PrimeNumber {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        prime obj = new prime();
        obj.Display2(num);
        scanner.close();
    }
}
