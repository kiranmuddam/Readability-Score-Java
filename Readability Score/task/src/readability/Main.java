package readability;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int specialCharCount = 0;
        String textInput = scanner.nextLine();
        if (textInput.length() > 100) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
