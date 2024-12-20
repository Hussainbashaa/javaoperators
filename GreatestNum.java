
public class GreatestNum {
    //!maximum of two numbers using 2 parameters

    public static int max(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("The maximum number is: " + max(num1, num2));
    }
}
