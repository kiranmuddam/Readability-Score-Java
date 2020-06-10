import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        String reversedInput = "";
        for (int i = userInput.length() - 1; i >= 0; --i) {
            reversedInput = reversedInput + userInput.charAt(i);
        }
        if (userInput.equals(reversedInput)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}