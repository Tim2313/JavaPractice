package array_practice;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] numbers = getUserNumbers();

        System.out.println("Input array: ");
        outputArray(numbers);

        reverse(numbers);
        outputArray(numbers);

    }

    public static int[] getUserNumbers() {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static void outputArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2 ; i++) {
            int leftNumber= numbers[i];
            int rightNumber = numbers[numbers.length - 1 - i];
            numbers[i] = rightNumber;
            numbers[numbers.length - 1 - i] = leftNumber;
            outputArray(numbers);
        }
    }

}
