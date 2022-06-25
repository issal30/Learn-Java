package GetterSetter;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("");
        user.setPassword("123");
        user.setBlock(false);
        System.out.println(user);
    }
}
