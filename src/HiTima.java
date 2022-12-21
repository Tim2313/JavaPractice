public class HiTima {
	public static void main(String[] args) throws java.io.IOException {
		System.out.println("Введіть своє ім'я: ");

		// for (int i = 0; i < 100; i++) {
		// 	char a = (char) System.in.read();
		// 	System.out.println("Char: " + a);
		// }

		String name = "";

		// do {
		// 	a = (char) System.in.read();

		// 	if (a != '\n') {
		// 		name = name + a;
		// 	}

		// } while (a != '\n');

		char a = 'a';
		for (;a != '\n';) {
			a = (char) System.in.read();
			
			if (a != '\n') {
			 	name += a;
			}

			//name += a;
		}

		System.out.println("Hi " + name + "!");
	}
}
