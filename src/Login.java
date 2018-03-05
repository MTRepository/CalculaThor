import java.util.Scanner;

public class Login {

    private final String USER = "michal";
    private final String PASSWORD = "patrycja";
    private Scanner scan;

    // creator
    public Login(Scanner scan) {
        this.scan = scan;
    }

    public void checkLogin() {

        String enteredLogin;

        do {

            System.out.print("Type in your login: ");
            enteredLogin = scan.nextLine();

        } while (!USER.equals(enteredLogin));


    }

    public void checkPassword() {

        String enteredPassword;

        do {

            System.out.print("Type in your password: ");
            enteredPassword = scan.nextLine();

        } while (!PASSWORD.equals(enteredPassword));

    }

}