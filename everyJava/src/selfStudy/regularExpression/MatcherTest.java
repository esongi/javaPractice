package selfStudy.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {
	public static void main(String[] args) {
		String str = ("abcd1234@naver.com");
		String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]{2,4}$";
		Pattern p = Pattern.compile(regex); // Pattern 객체 생성(인자에 정규식)
		Matcher m = p.matcher(str);
		if (m.find()) {
			System.out.println("이메일 형식이 맞다");
			System.out.println("start():" + m.start());
			System.out.println("group(): " + m.group());
		} else {
			System.out.println("이메일 형식이 아녀");
		}

		System.out.println("===============");

		// escape 문자 \ 방지를 위해서 \\를 두 개 사용
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1111-1234";
		boolean result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("정규식 일치");
		} else {
			System.out.println("실패");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "asdfnaver.com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("일치");
		} else {
			System.out.println("실패");
		}

	}
}