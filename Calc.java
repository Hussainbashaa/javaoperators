
public class Calc {

    int num1, num2;

    void sum() {
        int sum = num1 + num2;
        System.out.println("sum: " + sum);
    }

    int sub() {
        int sub = num1 - num2;
        return sub;
    }

    void mul(int a, int b) {
        int mul = a * b;
        System.out.println("mul :" + mul);
    }

    int div(int a, int b) {
        int div = num1 / num2;
        return div;
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        c.num1 = 10;
        c.num2 = 5;
        c.sum();
        System.out.println("sub:" + c.sub());

        c.mul(10, 5);
        System.out.println("div:" + c.div(10, 5));
    }

}
