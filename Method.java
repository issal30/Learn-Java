public class Method {
    //    METHOD=====================
//    static void sayHelloWorld(){
//        System.out.println("Hello World");
//    }
    public static void main(String[] args) {

        System.out.println(factorialRecursive(1));
    }

    //    METHOD PARAMETER
    static void sayHello(String nama, int umur) {
        System.out.println("Hello, namaku " + nama + " umurku " + umur);

    }

//    METHOD MULTI-FILE ==> QUIZ4_METHOD

    //    RECURSIVE METHODE
    static int factorialRecursive(int value) {
        System.out.println(value);
        return factorialRecursive(value + 1);


    }


}
