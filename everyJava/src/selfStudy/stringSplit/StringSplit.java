package selfStudy.stringSplit;

/**
 * @author USER split() 메소드는 정규표현식을 구분자로 해서 문자열을 배열에 저장하고 리턴
 */
public class StringSplit {
	public static void main(String[] args) {
		String str = "1&2,3,4,5&6-7";

		String splitStrArr[] = str.split("&|,|-");
		// '&' 또는 ',' 또는 '-' 이 구분자
		for (int i = 0; i < splitStrArr.length; i++) {
			System.out.println("split:" + (i + 1) + "-" + splitStrArr[i]);
		}
	}
}
