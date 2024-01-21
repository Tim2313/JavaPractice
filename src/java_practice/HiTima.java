package java_practice;

public class HiTima {
	public static void main(String[] args) throws java.io.IOException {
		System.out.println("Введіть своє ім'я: ");

		String name = "";

		char a = 'a';
		for (;a != '\n';) {
			a = (char) System.in.read();
			
			if (a != '\n') {
			 	name += a;
			}
		}

		System.out.println("Hi " + name + "!");
	}
}

