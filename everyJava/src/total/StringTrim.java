package total;

public class StringTrim {
	public static void main(String[] args) {
		String str = "    자바 프로그래밍 ";
		String str2 = null;
		String str3 = "열심히 공부합시다.";

		// trim()
		// 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴
		// 단, 중간의 공백은 제거하지 않음
		str2 = str.trim();
		System.out.println(str2 + str3);

	}
}
