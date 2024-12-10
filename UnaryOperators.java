
public class UnaryOperators {

    public static void main(String args[]) {
        int num1 = 10;
        int num2;
        System.out.println("num1=" + num1);
//!pre increment op used
        num2 = ++num1;
        System.out.println(num1 + " " + num2);

//! post increment op  used
        num2 = num1++;
        System.out.println(num1 + " " + num2);

//!pre decrement op used
        num2 = --num1;
        System.out.println(num1 + " " + num2);
//! post decrement op  used

        num2 = num1--;
        System.out.println(num1 + " " + num2);

        char char1 = 'A';
        char char2;
        char2 = ++char1;
        System.out.println(char2);

        //! post decrement op used
        char char3 = 'b';
        char char4;
        char4 = --char3;
        System.out.println(char4);
    }
}
