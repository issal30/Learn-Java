public class Extends {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.getCorner());

        VPresident president = new VPresident();
        System.out.println(president.getCorner());
        System.out.println(president.getParentCorner());
    }
}
