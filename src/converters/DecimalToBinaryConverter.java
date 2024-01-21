package converters;

import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();

        StringBuilder binaryBuilder = new StringBuilder();

        for (;;) {

            int remainder = decimal % 2;

            if (decimal == 0) {
                break;
            }
            if (remainder == 0) {
                binaryBuilder.append(0);
            }
            if (remainder != 0) {
                binaryBuilder.append(1);
            }
            decimal = decimal / 2;
        }

// Base
//        while (decimal != 0) {
//            int remainder = decimal % 2;
//            binaryBuilder.append(remainder);
//            decimal /= 2;
//        }
// Cringe
//        for (int i = decimal; i != 0; i /= 2) {
//            int remainder = i % 2;
//            binaryBuilder.append(remainder);
//        }
        String binary = binaryBuilder.reverse().toString();
        System.out.println(binary);
    }
}
