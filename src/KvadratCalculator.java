import java.util.Scanner;

public class KvadratCalculator {

	public static void main(String[] args) throws java.io.IOException {
		int maghelp = args.length;

		System.out.println("Програма вирішує квадратні рівняння");
		System.out.println("ax^2 + bx + c = 0");
		System.out.println("Будь ласка введіть a, b, c: ");

		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble(); 
		double c = scanner.nextDouble();

		double D = b * b - 4 * a * c;
		
		if (D > 0) {
			double x1, x2;
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("Корні рівняння: x1 = " + x1 + ", x2 = " + x2);

		}
		else if (D == 0) {

			double x = -b / (2 * a);
			System.out.println("Рівняння має один корінь: x = " + x);
		}
		else {
			System.out.println("Рівняння не має коренів!");
		}
	}
}
