package selfStudy.stringSplit;

import java.util.StringTokenizer;

/**
 * @author USER StringTokenizer 클래스는 문자열이 한 종류의 구분자로 연결되어 있을 경우 한 클래스로 문자를 구분자로
 *         해서 문자열ㅇㄹ 분리 객체를 생성할 때 첫번째 매개값으로 전체 문자열을 주고, 두번째 매개값으로 구분자를 주면 된다 만약
 *         구분자를 생략하면 공백이 기본 구분자가 된다
 */
public class StringTokenizerExam {
	public static void main(String[] args) {
		String str = "1,2,3,4,5,6,7";

		int i = 0;

		StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println("StringTokenizer:" + (i + 1) + "-" + stringTokenizer.nextToken());
			i++;
		}
	}
}
