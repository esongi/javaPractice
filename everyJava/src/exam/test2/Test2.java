package exam.test2;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		Test2 test = new Test2();
		System.out.println(Arrays.toString(test.gcdlcm(2, 5)));
	}

	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	public static int gcd(int p, int q) {
		if (q == 0) {
			return p;
		}
		return gcd(q, p % q);
	}
}
