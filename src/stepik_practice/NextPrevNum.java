package stepik_practice;

import java.util.Scanner;
class NextPrevNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int prev = a - 1;
        int next = a + 1;

        String massagePrevNext = "The Next number is:\t%d\t\tThe Previous number is:\t%d\n";

        System.out.printf(massagePrevNext, next, prev);

    }
}