public class fibonacci {

	public static void main(String []args) {
		int lengthOfSequence = 10;
		for (int i = 0; i < lengthOfSequence; i++) {
			if (i == lengthOfSequence - 1) {
				System.out.print(fibonacci(i));
			}
			else {
				System.out.print(fibonacci(i) + ",");
			}
		}
	}
     
	public static int fibonacci(int n)  {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			int fibTerm = fibonacci(n - 1) + fibonacci(n - 2);
			return fibTerm;
		}
	}
}
