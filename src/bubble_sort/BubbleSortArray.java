package bubble_sort;

import java.util.Scanner;

//best case: [1,2,3,4,5,6,7,8] = 0
//worst case: [8,7,6,5,4,3,2,1] = lenght - 1
//average case: [4, 3, 6, 5, 8, 1, 2] = ot 0 do lenght - 1
public class BubbleSortArray {
    public static void main(String[] args) {
        int[] numbers = getInputNumbers();

        System.out.println("Starter array: ");
        printArray(numbers);

        bubbleSortArray(numbers);

        System.out.println("Sorted array: ");
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print('\n');
    }

    public static void bubbleSortArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                int first = numbers[j];
                int second = numbers[j + 1];
                if (first > second) {
                    numbers[j] = second;
                    numbers[j + 1] = first;
                }
            }
        }
    }

    public static int[] getInputNumbers() {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
}
