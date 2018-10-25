package hello;

public class User {
    private final String loginId;
    private final String password;

    public User(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassWord() {
        return password;
    }
}
