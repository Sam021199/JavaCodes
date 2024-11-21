import java.util.Optional;

public class TechJavaOptional {
    public static void main(String[] args){
        User user1 = new User("Sam","sam@email.com");
        User user2 = new User("Iram",null);

        String email1 = getUserByEmail(user1);
        String email2 = getUserByEmail(user2);

        System.out.println(email1);
        System.out.println(email2);
    }

    public static String getUserByEmail(User user){
        return Optional.ofNullable(user.getEmail())
                .orElse("No email present");
    }
}

class User{
    private String name;
    private String email;

    public User(String name,String email){
        this.name=name;
        this.email=email;
    }

    public String getEmail(){
        return email;
    }
}