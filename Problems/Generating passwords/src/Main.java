import java.util.*;

public class Main {
    public static String generatePassword(int inputA, int inputB, int inputC, int inputN) {
        String generatedPassword = "";
        int totalUpperCaseChar = 0;
        int totalLowerCaseChar = 0;
        int totalDigits = 0;
        int currentIteration = 0;
        if (inputA == 0 && inputB == 0 && inputC == 0) {
            int i = 0;
            while (generatedPassword.length() < inputN) {
                generatedPassword = generatedPassword + (char) (i + 65);
                ++i;
                if (i == 25) {
                    totalUpperCaseChar = totalUpperCaseChar + 26;
                    i = 0;
                }
            }
            return generatedPassword;
        }
        while (generatedPassword.length() < inputN) {
            for (int i = 0; i < inputA && generatedPassword.length() < inputN && i + totalUpperCaseChar <= inputA; ++i) {
                generatedPassword = generatedPassword + (char) (i + 65 + currentIteration);
                if (i == 25) {
                    totalUpperCaseChar = totalUpperCaseChar + 26;
                    i = 0;
                }
            }
            for (int i = 0; i < inputB && generatedPassword.length()  < inputN && i + totalLowerCaseChar <= inputB; ++i) {
                generatedPassword = generatedPassword + (char) (i + 97 + currentIteration);
                if (i == 25) {
                    totalLowerCaseChar = totalLowerCaseChar + 26;
                    i = 0;
                }
            }
            for (int i = 0; i < inputC && generatedPassword.length() < inputN && i + totalDigits <= inputC; ++i) {
                generatedPassword = generatedPassword + (char) (i + 48 + currentIteration);
                if (i == 9) {
                    totalDigits = totalDigits + 10;
                    i = -1;
                }
            }
            ++currentIteration;
        }

        //System.out.println(generatedPassword.length());
        //System.out.println(totalUpperCaseChar);
        //System.out.println(totalLowerCaseChar);
        //System.out.println(totalDigits);
        return generatedPassword;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        int inputC = scanner.nextInt();
        int inputN = scanner.nextInt();
        System.out.println(generatePassword(inputA, inputB, inputC, inputN));
    }
}