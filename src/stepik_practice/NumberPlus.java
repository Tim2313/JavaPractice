package stepik_practice;

public class NumberPlus {
	public static void main(String[] args) {

		if (args.length != 1) {
			int count = args.length;
			System.out.println("Invalid Input. Arguments count: " + count);
			return;
		} 

		int numberP = Integer.parseInt(args[0]);
		String res = "Result ";
		int operate = numberP + 1;
		String fin = res + operate;
		System.out.println(fin);

	}
}



