package stepik_practice;

public class InsertElement {
    public static void main(String[] args) {

        int n = 12;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {

            array[i] = i;
        }
        int temp = 9;

        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
