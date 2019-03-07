package exam.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.print("값을 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("약수의 합: " + test1.solution(num));
		sc.close();
	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer + n;
	}
}
