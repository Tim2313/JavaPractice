public class MyFirstApp {
	public static void main (String[] args) {
		long longValue = 0L;
		longValue = -1;
		for (int i = 0; i < 63; i++) {
			//longValue = longValue * 2L;
			longValue *= 2;
			int iteration = i + 1;
			System.out.println("Iteration: " + iteration + ". longValue= " + longValue);		
		}

		byte maxValue = 127;
		System.out.println("Maximum byte value = " +  maxValue);
		
		byte t = 0;
		for (int i = 0; i < 10; i++) {
			t++;
			System.out.println("Iteration: " + i + ". t= " + t);
		}
		
	}	
}
