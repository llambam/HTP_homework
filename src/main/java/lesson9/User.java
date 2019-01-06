package lesson9;

public class User {

    private String userName;
    private String userSurname;
    private int userAge;
    private int userVeight;
    private boolean userMan;

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userAge=" + userAge +
                ", userVeight=" + userVeight +
                ", userMan=" + userMan +
                '}';
    }

    public int getUserAge() {
        return userAge;
    }

    public int getUserVeight() {
        return userVeight;
    }

    public User() {
    }

    public User(String userName, String userSurname, int userAge, int userVeight, boolean userMan) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAge = userAge;
        this.userVeight = userVeight;
        this.userMan = userMan;
    }
}
