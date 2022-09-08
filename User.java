public class User {
    private String name;
    private Password password;

    User() {
        this("Bebeboka", "12345");
    }

    User(String name, Password password) {
        this.name = name;
        this.password = password;
    }
}