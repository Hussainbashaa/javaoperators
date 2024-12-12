//!Area of Rectangle
// public class area {
// double length;
// double width;

// public double getArea() {
//     return length * width;
// }
// public double getPerimeter() {
//     return 2*(length + width) ;
// }
// public static void main(String[] args) {
//     area a=new area();
//     a.length=5.8676;
//     a.width=3.465;
//     System.out.println();
//     System.out.println();
//     System.out.println("Area of rectangle is: "+a.getArea());
//     System.out.println("perimeter of rectangle is: "+a.getPerimeter());
//     System.out.println();
//     System.out.println();
// }
// }
//! Area of Circle
public class area {

    double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * (Math.PI * radius);
    }

    public static void main(String[] args) {
        area a = new area();
        a.radius = 5.2;
        System.out.println();
        System.out.println();
        System.out.println("area :" + a.getArea());
        System.out.println("Perimeter :" + a.getPerimeter());
        System.out.println();
        System.out.println();
    }
}
