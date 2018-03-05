import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Functions {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public int findFactorial(int var) {
        int score = 1;
        for (int i = 1; i <= var; i++) {
            score = score * i;
        }
        return score;
    }

    public double power(double varbase, double varex) {
        return Math.pow(varbase, varex);
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

    public void writeToFile(String cos, File file) {
        StringBuilder stringBuilder = new StringBuilder();


    }

}
