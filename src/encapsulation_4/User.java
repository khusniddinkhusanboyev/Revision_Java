package encapsulation_4;

public class User {
    public static void main(String[] args) {
        Encapsulation encapsulation=new Encapsulation("Xusniddin" ,"khusniddinkhusanboyev@gmail.com",978117074,7640);
        System.out.println("name: "+ encapsulation.getName());
        System.out.println("email: "+ encapsulation.getEmail());
        System.out.println("password: "+ encapsulation.getPassword());
        System.out.println("phone number: "+ encapsulation.getPhoneNumber());
    }
}
