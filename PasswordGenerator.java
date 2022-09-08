import java.util.Vector;

public class PasswordGenerator {
    protected Vector Password = new Vector();
    private String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private String upperCaseLetters = lowerCaseLetters.toUpperCase();
    private String numbers = "0123456789";
    private String specialSymbols = " !#$%&'()*+,-./:;<=>?@[]^_`{|}~";
    private String allSymbols = lowerCaseLetters + upperCaseLetters + numbers + specialSymbols;

    PasswordGenerator() {
        this(8);
    }

    PasswordGenerator(int length) {
        setPassword(Password, length);
    }

    public void newPassword(int length) {
        this.Password.clear();
        setPassword(Password, length);
    }

    private void setPassword(Vector Password, int length) {
        for (int i = 0; i < length; i++) {
            int pos = (int) (Math.random() * (allSymbols.length()));
            char temp = allSymbols.charAt(pos);
            Password.add(temp);
        }
    }

    public void getPassword() {
        for (Object i : Password) {
            System.out.print(i);
        }

        System.out.println(" ");
    }

}