package GetterSetter;

public class User {
    private String username;
    private String password;
    private boolean block;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
//        if (username.equals("")){
//            this.username = "Guest";
//        }else {
            this.username = username;


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", block=" + block +
                '}';
    }
}
