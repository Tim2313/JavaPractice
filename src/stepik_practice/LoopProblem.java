package stepik_practice;

import java.util.Scanner;

public class LoopProblem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = 0;
            for (int j = 0; j <= n - 1; j++) {
                sum += Math.pow(a, j) * b;
                System.out.printf("%d ", sum);
            }
            System.out.println();
            System.out.println("end");
        }
    }
}
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98
