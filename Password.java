import java.util.Vector;

public class Password {
    protected Vector Password = new Vector();

    Password() {
        this("12345");
    }

    Password(String value) {
        setPassword(Password, value);
    }

    Password(PasswordGenerator value) {
        setPassword(Password, value);
    }

    public void newPassword(String value) {
        this.Password.clear();
        setPassword(Password, value);
    }

    public void newPassword(PasswordGenerator value) {
        this.Password.clear();
        setPassword(Password, value);
    }

    private void setPassword(Vector Password, String value) {
        for (int i = 0; i < value.length(); i++) {

            char temp = value.charAt(i);
            Password.add(temp);
        }
    }

    private void setPassword(Vector Password, PasswordGenerator value) {
        for (int i = 0; i < value.Password.size(); i++) {

            char temp = (char) value.Password.elementAt(i);
            Password.add(temp);
        }
    }

    public void getPassword() {
        for (int i = 0; i < Password.size(); i++) {
            System.out.print(Password.get(i));
        }

        System.out.println(" ");
    }

}