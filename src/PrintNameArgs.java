
public class PrintNameArgs {
	public static void main(String[] args) {
		int arrayLength = args.length;
		System.out.println("Vot takaya dlina u nas: " + arrayLength);
		if (arrayLength == 0) {
			System.out.println("Nemojlivo vivesti nichogo"); 
		} else {
			String firtsArrayElement = args[0];
			System.out.println(firtsArrayElement);
		}	
	}
}
