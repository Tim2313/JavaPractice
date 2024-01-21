package stepik_practice;

import java.util.Arrays;

public class replaceAnyNumberInMassive {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        int a = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {

            int firstEl = numbers[i];
            int secondEl = numbers[i + 1];

            numbers[i] = secondEl;
            numbers[i + 1] = firstEl;




        }
        System.out.println(Arrays.toString(numbers));
    }
}
