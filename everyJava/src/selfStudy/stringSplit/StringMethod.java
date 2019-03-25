package selfStudy.stringSplit;

import java.util.StringTokenizer;

public class StringMethod {
	public static void main(String[] args) {
		String str = "1,2,3,4,,,5,6,7,";

		String splitStrArr[] = str.split(",");
		for (int i = 0; i < splitStrArr.length; i++) {
			System.out.println("split: " + (i + 1) + "-" + splitStrArr[i]);
		}

		// 아무 값도 가지지 않는 부분이 분리가 되는 경우 잘 처리가능
		int i = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
		while (stringTokenizer.hasMoreElements()) {
			System.out.println("StringTokenizer: " + (i + 1) + "-" + stringTokenizer.nextToken());
		}
	}
}
