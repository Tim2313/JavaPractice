package stepik_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kegliCount = sc.nextInt();
        String[] kegli = new String[kegliCount];

        for (int i = 0; i < kegli.length; i++) {
            kegli[i] = "I";
        }

        int ballsCount = sc.nextInt();
        for (int i = 0; i < ballsCount; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            replaceInterval(kegli, start, end);
        }
        for (int i = 0; i < kegli.length; i++) {
            System.out.print(kegli[i]);
        }
        System.out.println();
    }

    public static void replaceInterval(String[] kegli, int start, int end) {
        for (int i = start - 1; i < end; i++) {
            kegli[i] = ".";
        }
    }
}
