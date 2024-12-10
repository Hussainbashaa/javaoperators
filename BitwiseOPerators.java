
public class BitwiseOPerators {

    public static void main(String[] args) {
//!Bitwise operators

        int a = 10;
        int b = 20;
        //? AND operator
        System.out.println("a & b = " + (a & b));
        //? OR operator 
        System.out.println("a | b = " + (a | b));
        //? XOR operator  
        System.out.println("a ^ b = " + (a ^ b));
        //? ~ operator
        System.out.println("~a = " + (~a));
        //? left shift operator
        System.out.println("a << 1 = " + (a << 2));
        //? right shift operator
        System.out.println("a >> 1 = " + (a >> 2));
        //? unsigned right shift operator
        System.out.println("a >>> 1 = " + (a >>> 2));

        //! Ternary operator
        int num1 = 20;
        int num2 = 30;
        int num3 = 40;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        int m = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println(m);

    }
}
