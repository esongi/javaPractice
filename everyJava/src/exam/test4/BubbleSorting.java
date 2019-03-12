package exam.test4;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] original = { 5, 3, 4, 1, 2 };
		System.out.println(Arrays.toString(original));

		int[] result = bubbleSort(original);
		System.out.println(Arrays.toString(result));

	}

	static int[] bubbleSort(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {
			System.out.println("현재 PASS");
			for (int j = 1; j < len - i; j++) {
				System.out.printf("%d번째 %d와 %d번째 %d 비교\n", j - 1, arr[j - 1], j, arr[j]);
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
}
