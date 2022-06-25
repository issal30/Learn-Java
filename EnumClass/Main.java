package EnumClass;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Faisal");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getLevel().getDescription());
    }
}
