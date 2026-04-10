import java.util.Scanner;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        if (password.length() > 2) {
            String lastTwo = password.substring(password.length() - 2);
            String masked = password.substring(0, password.length() - 2).replaceAll(".", "*") + lastTwo;
            System.out.println(masked);
        } else {
            System.out.println(password);
        }
    }
}
