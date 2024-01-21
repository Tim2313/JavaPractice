package java_practice.calculators;

import java.util.Scanner;

public class KvadratCalculatorNew {

    public static void main(String[] args) {

            System.out.println("Програма вирішує квадратні рівняння");
            System.out.println("ax^2 + bx + c = 0");
            System.out.println("Будь ласка введіть b, a, c: ");

            Scanner scanner = new Scanner(System.in);

            double b = scanner.nextDouble();
            double a = scanner.nextDouble();
            double c = scanner.nextDouble();

            double det = calculateDet(a, b, c);

            if (det > 0) {
                calculateRootsForPositiveDet(det, a, b);
            } else if (det == 0) {
                calculateRootForNormal(a, b);
            } else {
                System.out.println("Рівняння не має коренів!");
            }
        }

        public static double calculateDet(double a, double b, double c) {
            return b * b - 4 * a * c;
        }

        public static void calculateRootsForPositiveDet(double det, double a, double b) {
            double x1, x2;
            x1 = (-b - Math.sqrt(det)) / (2 * a);
            x2 = (-b + Math.sqrt(det)) / (2 * a);
            String massageMath = "Корні рівняння:\nx1 = % .2f;\nx2 = % .2f;\n";
            System.out.printf(massageMath, x1, x2);
        }

        public static void calculateRootForNormal(double a, double b) {
            double x = -b / (2 * a);
            String massageMat = "Рівняння має один корінь:\nx = %.2f\n";
            System.out.printf(massageMat, x);
        }
    }

