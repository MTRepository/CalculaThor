import java.util.Scanner;

public class CalculaTHOR {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Login login = new Login(scan);

        login.checkLogin();
        login.checkPassword();

        System.out.println("Well done. You are in!");

        MainManu mainManu = new MainManu(scan);
        mainManu.mainManu(scan);

    }

}