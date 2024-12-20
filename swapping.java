
// public class swapping {
//     int a = 8;
//     int b =3 ;
//     public void swap() {
//         System.out.println(" Before Swapped values are: " + a + " and " + b);
//         a = a + b;
//         b = a - b;
//         a = a - b;
//         System.out.println("Swapped values are: " + a + " and " + b);
//     }
//     public static void main(String[] args) {
//         swapping obj = new swapping();
//         obj.swap();
//     }
// }
//7using scanner class
import java.util.Scanner;

public class swapping {

    static void swap(int a, int b) {
        System.out.println(" Before Swapped values are: " + a + " and " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" After Swapped values are: " + a + " and " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        swap(a, b);

    }

}
