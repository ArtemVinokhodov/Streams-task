package entity;

public class User {
    private final String name;
    private final String Mail;


    public User(String name, String eMail) {
        this.name = name;
        this.Mail = eMail;
    }

    public String getMail() {
        return Mail;
    }

    @Override
    public String toString() {
        return "User{" +
                " name='" + name + '\'' +
                ", has eMail='" + Mail + '\'' +
                '}';
    }
}
