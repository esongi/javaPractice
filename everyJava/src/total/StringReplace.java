package total;

/**
 * @author USER String 객체의 문자열은 변경이 불가한 특성을 갖기 떄문에 replace() 메소드가 리턴하는 문자열은 원래
 *         문자열의 수정본이 아니라 완전히 새로운 문자열 즉, str2는 str과 같은 객체를 참조하는 것이 아닌 새로운 문자열 객체를
 *         참조 물론, String 객체의 문자열은 변경이 불가능하다는 특성을 생각하면 다른 메소드도 마찬가지
 */
public class StringReplace {
	public static void main(String[] args) {
		String str = "before replace";
		String str2 = null;

		// replace()
		// 첫 번째 매개값인 문자열을 찾아 두 번째 매개값인 문자열로 대치한
		// 새로운 문자열을 생성하고 리턴
		str2 = str.replace("before", "after");
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
	}
}
