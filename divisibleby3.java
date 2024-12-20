
import java.util.Scanner;

class Div {

    void Display(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class divisibleby3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        Div obj = new Div();
        obj.Display(num);

    }
    // Scanner.close();

}
