package exam.test4;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] original = { 5, 3, 4, 1, 2 };
		System.out.println(Arrays.toString(original));

		int[] result = selectSort(original);
		System.out.println(Arrays.toString(result));
	}

	static int[] selectSort(int[] arr) {
		int len = arr.length;
		int temp;

		for (int i = 0; i < len - 1; i++) {
			System.out.println("현재 PASS");
			for (int j = i + 1; j < len; j++) {
				System.out.printf("%d번째 %d와 %d번째 %d 비교\n", i, arr[i], j, arr[j]);
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		return arr;
	}

}
