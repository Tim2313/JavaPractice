package insert_sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        int[] numbers = getUsersNumbers();

        System.out.println("Current array: ");
        outputUsersArray(numbers);

        insertionSort(numbers);

        System.out.println("Sorted array: ");
        outputUsersArray(numbers);

    }

    public static int[] getUsersNumbers() {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static void outputUsersArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    //curIdx = Current Index
    public static void insertionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int curIdx = i;
            while ((curIdx >= 0) && (numbers[curIdx] > numbers[curIdx + 1])) {
                int temp = numbers[curIdx];

                numbers[curIdx] = numbers[curIdx + 1];
                numbers[curIdx + 1] = temp;
                curIdx = curIdx - 1;
            }
        }
    }
}
