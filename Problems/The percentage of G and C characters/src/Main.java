import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int stringLength = userInput.length();
        int genomeCount = 0;
        double genomePercent = 0.0;
        for (int i = 0; i < stringLength; ++i) {
            char currentChar = userInput.charAt(i);
            currentChar = Character.toLowerCase(currentChar);
            //System.out.println(currentChar);
            if (currentChar == 'g' || currentChar == 'c') {
                ++genomeCount;
            }
        }
        //System.out.println(genomeCount);
        genomeCount = genomeCount * 100;
        genomePercent = (double) genomeCount / stringLength;
        System.out.println(genomePercent);
    }
}