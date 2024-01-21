package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = generateArray();
        int itemToSearch = sc.nextInt();

        int itemIdx = binarySearch(numbers, itemToSearch);

        String array = Arrays.toString(numbers);
        String arrayMassagePattern = "Array: %s\n";
        System.out.printf(arrayMassagePattern, array);

        String indexMassagePattern = "number '%d' placed on index '%d'\n";
        System.out.printf(indexMassagePattern, itemToSearch, itemIdx);
    }

    private static int binarySearch(int[] numbers,  int itemToSearch) {
        int itemIdx = -1;
        int startIdx = 0;
        int endIdx = numbers.length - 1;
        int countIter = 0;
        while (startIdx != endIdx) {
            countIter++;
            int elementsCount = endIdx - startIdx;
            int halfElem = elementsCount / 2;
            int centreIdx = startIdx + halfElem + 1;
            int centerNumber = numbers[centreIdx];

            if (itemToSearch == centerNumber) {
                itemIdx = centreIdx;
                break;
            }

            if (itemToSearch > centerNumber) {
                // centerNumber - number.length - 1;
                startIdx = centreIdx;
            } else {
                // [0] - centreNumber;
                endIdx = centreIdx;
            }
        }
        System.out.println("Iterations: " + countIter);
        return itemIdx;
    }

    private static int[] generateArray() {
        Scanner sc = new Scanner(System.in);

        int elemCount = sc.nextInt();
        int[] numbers = new int[elemCount];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        return numbers;
    }
}
