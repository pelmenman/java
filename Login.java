import java.util.Vector;

public class Login {
    protected Vector login = new Vector();

    Login() {
        this("IvanKrutoi");
    }

    Login(String name) {
        setName(login, name);
    }

    public void newName(String newName) {
        this.login.clear();
        setName(login, newName);
    }

    private void setName(Vector login, String name) {
        for (int i = 0; i < name.length(); i++) {
            char temp = name.charAt(i);
            login.add(temp);
        }
    }

    public void deleteLogin() {
        this.login.clear();
    }

    public void getLogin() {
        int length = login.size();
        for (int i = 0; i < length; i++) {
            System.out.print(login.get(i));
        }

        System.out.println("");
    }
}