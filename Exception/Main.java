package Exception;

public class Main {
    public static void main(String[] args) {
        LoginRequest login = new LoginRequest("", "");

        ValidationUtil.validate(login);

    }
}
