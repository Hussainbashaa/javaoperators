
public class LogicalOperators {

    public static void main(String[] args) {
        boolean var1 = true;
        boolean var2 = false;
        //! AND
        System.out.println(var1 && var2);
        //! OR
        System.out.println(var1 || var2);
        //! NOT
        System.out.println(!var1);
        //! XOR
        System.out.println(var1 ^ var2);
        //! NAND
        System.out.println(!(var1 && var2));
        //! NOR
        System.out.println(!(var1 || var2));
    }
}
