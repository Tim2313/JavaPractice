package merge_sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    private static int counter = 0;

//    public static void main(String[] args) {
//
//        Random r = new Random();
//
//        int[] numbers = new int[1_000];
//        for (int i = numbers.length - 1; i != 0; i--) {
//            numbers[i] = i;
//        }
//
//        splitSort(numbers);
//
//        System.out.println(Arrays.toString(numbers));
//
//        System.out.println(counter);
//
//    }

    public static void splitSort(int[] array) {
        int size = array.length;
        if (size == 1) {
            return;
        }

        int mid = size / 2;
        int[] firstPart = new int[mid];
        int[] secondPart = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            firstPart[i] = array[i];
        }

        for (int i = mid; i < size; i++) {
            secondPart[i - mid] = array[i];
        }

        splitSort(firstPart);
        splitSort(secondPart);
        merge(array, firstPart, secondPart);
    }

    public static void merge(int[] arr, int[] firstPart, int[] secondPart) {

        int left = firstPart.length;
        int right = secondPart.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right) {
            counter++;
            if (firstPart[i] < secondPart[j]) {
                arr[idx] = firstPart[i];
                i++;
            } else {
                arr[idx] = secondPart[j];
                j++;
            }
            idx++;
        }
        for (int ll = i; ll < left; ll++) {
            arr[idx++] = firstPart[ll];
            counter++;
        }
        for (int rr = j; rr < right; rr++) {
            arr[idx++] = secondPart[rr];
            counter++;
        }
    }
}
