package encapsulation_4;

public class Encapsulation {
    // Encapsulation is mainly used to hide class' attributes / methods from users. To achieve this, you have to do followings
    // private key word belongs to ENCAPSULATION
    private String name;
    private String email;
    private int phoneNumber;
    private int password;

    // this. keyword is used instead of set method in an encapsulation
    public Encapsulation(String name, String email, int phoneNumber, int password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // get and set methods are conception of ENCAPSULATION

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
