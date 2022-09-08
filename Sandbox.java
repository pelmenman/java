public class Sandbox {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" World");
        System.out.println(str);
        StringBuilder example = new StringBuilder("Just workin");
        example.append(".. Workin hard").append(" so I can please you");
        System.out.println(example);

        StringBuffer str2 = new StringBuffer(str);
        str2.delete(0, 2);
        System.out.println(str2);

        str2.deleteCharAt(5);
        System.out.println(str2);

        str2.insert(4, str);
        System.out.println(str2);

        String s = new String("meme");
        str2.replace(0, 2, s);
        System.out.println(str2);

        str2.reverse();

        System.out.println(str2);
    }

    /*
     * public static void main(String[] args) {
     * PasswordGenerator randomPassword = new PasswordGenerator(20);
     * randomPassword.getPassword();
     * 
     * Password password = new Password("AbiBa77%");
     * password.getPassword();
     * password.newPassword("aBoBa404");
     * password.getPassword();
     * password.newPassword(randomPassword);
     * password.getPassword();
     * 
     * Login login = new Login("Artamkin");
     * login.getLogin();
     * login.newName("Petruha");
     * login.getLogin();
     * 
     * System.out.println("======");
     * 
     * 
     * 
     * /*int[][] matrix = { { 1, 2, 3 },
     * { 4, 5, 6 },
     * { 7, 8, 9 } };
     * 
     * System.out.println(matrix[0][2]);
     */

}
