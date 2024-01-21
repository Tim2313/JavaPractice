package liner_search;

import java.util.Arrays;
import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = generateArray();

        int itemToSearch = sc.nextInt();

        int itemIdx = linerSearch(numbers, itemToSearch);

        String array = Arrays.toString(numbers);
        String arrayMassagePattern = "Array: %s\n";
        System.out.printf(arrayMassagePattern, array);

        String indexMassagePattern = "number '%d' placed on index '%d'\n";
        System.out.printf(indexMassagePattern, itemToSearch, itemIdx);
    }

    public static int linerSearch(int[] numbers, int itemToSearch) {
        int itemIdx = -1;
        int iterCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            iterCount++;
            int a = numbers[i];


            if (itemToSearch == a) {
                itemIdx = i;
                break;
            }
        }
        System.out.println("Iteration count: " + iterCount);
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
