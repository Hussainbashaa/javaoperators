
class accessModifiers {

    static {
        System.out.println("static Demo");
    }

    static void message() {
        System.out.println("Hello, World!");
    }
}

public class Demostatic {

    public static void main(String[] args) {
        accessModifiers o = new accessModifiers();
        o.message();

    }
}
//!Notes
//? public
// we can access anywhere in the program
//? private
//we can access within a class 
// if we wan tto use this class ,we use getter and setter methods
//? protected
// we can access within a class and we can access by using inherited classes

//? Default 
// we can access within a package
