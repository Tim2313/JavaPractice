package array_practice;

import java.util.Scanner;

public class ArraySumAndReverseSort {
    public static void main(String[] args) {

        int[] numbers = getUserInput();

        outputNumbers(numbers);

        int solve = getElementsSum(numbers);
        System.out.println("Сума всіх чисел в масиві: " + solve);

        reverseSort(numbers);

        outputNumbers(numbers);
    }

    public static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static void outputNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int getElementsSum(int[] numbers) {
        int solve = 0;
        for (int i = 0; i < numbers.length; i++) {
            solve += numbers[i];
        }
        return solve;
    }

    public static void reverseSort(int[] numbers) {
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int f = numbers[i];
                int s = numbers[i + 1];
                if (f < s) {
                    numbers[i] = s;
                    numbers[i + 1] = f;
                }
            }
        }
    }
}

