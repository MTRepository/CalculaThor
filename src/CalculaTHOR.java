import java.util.Scanner;

public class CalculaTHOR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String USER = "michal";
        final String PASSWORD = "patrycja";

        boolean loggedIn = false;

        System.out.println("Please log in to the system - give your login and password below.");

        do {

            System.out.print("Login: ");
            String login = sc.nextLine();

            System.out.print("Password: ");
            String passWord = sc.nextLine();

            if (USER.equals(login) && PASSWORD.equals(passWord)) {
             loggedIn = true;

             } else {

             System.out.println("Invalid data!"); }

        } while (!loggedIn);

        System.out.println("Well done.");

        int readOff;
        Scanner scan = new Scanner(System.in);

        int first, second, third;
        String forth;

        do {

            System.out.println("Hi, what do you want to do?");
            System.out.println("0 - Leave the program");
            System.out.println("1 - Add numbers");
            System.out.println("2 - Subtract numbers");
            System.out.println("3 - Multiply numbers");
            System.out.println("4 - Divide numbers");
            System.out.println("5 - Find factorial");
            System.out.println("6 - Convert decimal number to binary code");
            System.out.println("7 - Calculate power");

            // Error control - to be created
            // is integer?

            // screen read-off
            readOff = scan.nextInt();

            // For easier use of the console
            // Option 0
            if(readOff == 0) { System.out.println("Bye!"); break; }

            // Option 1
            if(readOff == 1) {

                System.out.println("Give me your first number");
                first = scan.nextInt();
                System.out.println("Give me your second number");
                second = scan.nextInt();

                third = addNumbers(first,second);
                System.out.println(third);

            }

            // Option 2
            if(readOff == 2) {

                System.out.println("Give me your first number");
                first = scan.nextInt();
                System.out.println("Give me your second number");
                second = scan.nextInt();

                third = subtractNumbers(first,second);
                System.out.println(third);

            }

            // Option 3
            if(readOff == 3) {

                System.out.println("Give me your first number");
                first = scan.nextInt();
                System.out.println("Give me your second number");
                second = scan.nextInt();

                third = multiplyNumbers(first,second);
                System.out.println(third);

            }

            // Option 4
            if(readOff == 4) {

                System.out.println("Give me your first number");
                first = scan.nextInt();
                System.out.println("Give me your second number");
                second = scan.nextInt();

                third = divideNumbers(first,second);
                System.out.println(third);

            }

            // Option 5
            if(readOff == 5) {

                System.out.println("Give me your number");
                first = scan.nextInt();

                third = findFactorial(first);
                System.out.println(third);

            }

            // Option 6
            if(readOff == 6) {

                System.out.println("Give me your number");
                first = scan.nextInt();

                forth = findBinary(first);
                System.out.println(forth);

            }

            // Option 7
            if(readOff == 7) {

                System.out.println("Give me the basis");
                first = scan.nextInt();
                System.out.println("Give me the exponent");
                second = scan.nextInt();

                third = power(first,second);
                System.out.println(third);

            }

            System.out.println("What now?");
            System.out.println("0 - leave the program");
            System.out.println("1 - calculate further");

            readOff = scan.nextInt();

            // Option 0
            if(readOff == 0) { System.out.println("Bye!"); break; }

            // Option 1
            if(readOff == 1) { continue; }


        } while (readOff != 0);

    }

    public static int addNumbers(int var1, int var2) {

        return var1 + var2;

    }

    public static int subtractNumbers(int var1, int var2) {

        return var1 - var2;

    }

    public static int multiplyNumbers(int var1, int var2) {

        return var1 * var2;

    }

    public static int divideNumbers(int var1, int var2) {

        return var1 / var2;

    }

    public static int findFactorial (int var) {

        int score = 1;
        for (int i = 1; i <= var; i++) {
            score = score * i;

        }

        return score;

    }

    public static int power (int var1, int var2) {

        for (int i = 2; i <= var2; i++) {
            var1 = var1 * var1;
        }
        return var1;

    }

    public static String findBinary(int decimal) {

        int[] binaries = new int[14];
        int[] matrix = new int[14];
        int numberToConvert = decimal;

        for (int i = 0; i < 14; i++) {

            binaries[i] = (int) Math.pow(2,i);

        }

        for (int i = matrix.length - 1; i >= 1; i--) {

            if (numberToConvert >= binaries[i]) {

                numberToConvert = numberToConvert - binaries[i];
                matrix[13 - i] = 1;

            }

            if (numberToConvert == 1) matrix[13] = 1;

        }

        StringBuilder mat = new StringBuilder("");

        for (int i = 0; i < 14; i++) {

            mat.append(String.valueOf(matrix[i]));

        }

        String marixToReturn;
        marixToReturn = mat.toString();

        return marixToReturn;

    }

}