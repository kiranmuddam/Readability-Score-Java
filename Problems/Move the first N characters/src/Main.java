import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.next();
        int stringLength = stringInput.length();
        char[] myArray = new char[stringLength];
        int inputN = scanner.nextInt();
        if (inputN > stringLength) {
            System.out.println(stringInput);
            return;
        }
        for (int i = 0; i < stringLength; ++i) {
            if (i < inputN) {
                myArray[stringLength - inputN + i] = stringInput.charAt(i);
            } else {
                myArray[i - inputN] = stringInput.charAt(i);
            }
        }
        String resultString = String.valueOf(myArray);
        System.out.println(resultString);
    }
}