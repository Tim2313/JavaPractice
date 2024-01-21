package quick_sort;

public class QuickSort {
    private static int counter = 0;

    public static void main(String[] args) {

        int[] numbers = new int[1_000];
        for (int i = numbers.length - 1; i != 0; i--) {
            numbers[i] = i;
        }

        quickSort(numbers, 0, numbers.length - 1);

        //System.out.println(Arrays.toString(numbers));
        System.out.println(counter);
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int pivot = partition(array, from, to);
            quickSort(array, from, pivot - 1);
            quickSort(array, pivot, to);
        }
    }

    public static int partition(int[] array, int from, int to) {
        int leftIdx = from;
        int rightIdx = to;
        int pivotIdx = array[from];
        while (leftIdx <= rightIdx) {
            counter++;
            while (array[leftIdx] < pivotIdx) {
                leftIdx++;
            }

            while (array[rightIdx] > pivotIdx) {
                rightIdx--;
            }

            if (leftIdx <= rightIdx) {
                swap(array, rightIdx, leftIdx);
                leftIdx++;
                rightIdx--;
            }
        }

        return leftIdx;
    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        counter++;
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}

