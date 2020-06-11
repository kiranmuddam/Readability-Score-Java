package readability;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalWordsCount = 0;
        int totalSentenceCount = 0;
        String inputText = scanner.nextLine();
        int strLength = inputText.length();
        if (inputText.charAt(strLength - 1) != '?' && inputText.charAt(strLength - 1) != '!' && inputText.charAt(inputText.length() - 1) != '.' ) {
            totalSentenceCount = 1;
        }
        String[] textArray = inputText.split("[\\s\\u00a0]");
        //System.out.println(textArray[0]);
        //System.out.println(textArray.length);
        for (int i = 0; i < textArray.length; ++i) {
            ++totalWordsCount;
            if (textArray[i].matches(".+[!?.]")) {
                ++totalSentenceCount;
            }
        }
        //System.out.println(totalWordsCount);
        //System.out.println(totalSentenceCount);
        double myCount = (double) totalWordsCount / totalSentenceCount;
        if (myCount > 10) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
