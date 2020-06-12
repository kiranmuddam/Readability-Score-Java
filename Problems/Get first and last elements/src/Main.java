import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] inputArray) {
        int[] resultArray = new int[2];
        resultArray[0] = inputArray[0];
        resultArray[1] = inputArray[inputArray.length - 1];
        return resultArray;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}