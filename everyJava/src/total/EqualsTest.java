package total;

public class EqualsTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str1 = null;
		String str2 = null;

		if (str1 != null && str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같음");
		} else {
			System.out.println("str1이 객체를 참조하고 있지 않음");
		}

		System.out.println("============");

		String originStr = "JAVA Programming";
		// toLowerCase()
		// 문자열을 모두 소문자로 바꾼 새로운 문자열을 생성한 후 리턴
		String lowerCase = originStr.toLowerCase();
		// toUpperCase()
		// 문자열을 모두 대문자로 바꾼 새로운 문자열을 생성한 후 리턴
		String upperCase = originStr.toUpperCase();

		System.out.println("lowerCase: " + lowerCase + ", upperCase: " + upperCase);

		String str = "java programming";
		System.out.println("소문자변환 확인:" + str.equals(lowerCase));

		// equalsIgnoreCase()
		System.out.println("대소문자구분없이 확인:" + str.equalsIgnoreCase(originStr));
	}
}