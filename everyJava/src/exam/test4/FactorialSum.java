package exam.test4;

public class FactorialSum {

	public static void main(String[] args) {
		int sum = 1;
		
		for(int i = 2, factorial = 1; i <= 20; i++) {
			factorial = factorial * i;
			sum = factorial + sum;
			System.out.println(sum);
		}
		
		
	}

}
