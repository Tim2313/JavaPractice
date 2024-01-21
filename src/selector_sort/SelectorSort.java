package selector_sort;

import java.util.Arrays;
import java.util.Random;

public class SelectorSort {
    private static int counter = 0;

    public static void main(String[] args) {

        Random r = new Random();

        int[] numbers = new int[1_000];

        for (int i = numbers.length - 1; i != 0; i--) {
            numbers[i] = i;
        }

        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(counter);

    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minimum = numbers[i];
            int minIdx = i;
            for (int j = i; j < numbers.length; j++) {
                counter++;
                int element = numbers[j];
                if (element < minimum) {
                    minimum = element;
                    minIdx = j;
                }
            }
            numbers[minIdx] = numbers[i];
            numbers[i] = minimum;
        }
    }
}



