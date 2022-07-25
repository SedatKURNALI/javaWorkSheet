package _14_EncapsulationFaDu.Q02;

public class User {
    private static int id=1001;
    private int userId;
    private String username;
    private String password;
    private boolean active=false;
    private boolean signedIn=false;

    public User(String username, String password, boolean active, boolean signedIn) {
        this.userId = ++id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
