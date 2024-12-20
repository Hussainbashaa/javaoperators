
class Product {

    String pname;
    float cost;
    String Brand;
    int Quantity;
    String type;

    void Display() {
        System.out.println("Product Name:" + pname);
        System.out.println("Product Cost:" + cost);
        System.out.println("Product Brand:" + Brand);
        System.out.println("Product Quantity:" + Quantity);
        System.out.println("Product type:" + type);

    }

}

public class product1 {

    public static void main(String[] args) {
        Product p = new Product();
        p.pname = "Shirt";
        p.cost = 2999f;
        p.Brand = "Zara";
        p.Quantity = 2;
        p.type = "Cotton";
        p.Display();

    }

}
