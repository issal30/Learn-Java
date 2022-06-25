package HasCode;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Toy", 1000);
        Product product2 = new Product("Toy", 1000);

        System.out.println(product1.equals(product2));
        System.out.println(product2.hasCode() == product1.hasCode());
    }
}
