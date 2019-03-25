package total;

public class StringSubstring {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOP";
		String str2 = "IJK";

		// indexOf()
		// 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
		int position = str.indexOf("BCD");
		int position2 = str.indexOf(str2);
		System.out.println("position: " + position);
		System.out.println("position2:" + position2);

		// substring()
		// 주어진 인덱스에서 문자열을 추출
		// substring(int beginIndex, int endIndex): 주어진 시작과 끝 인덱스 사이의 문자열 추출
		String subStr = str.substring(1, 8);
		System.out.println("subStr:" + subStr);

		// substring(int beginIndex): 주어진 인덱스 이후부터 끝까지 문자열을 추출
		String subStr2 = str.substring(8);
		System.out.println("subStr2: " + subStr2);

		// indexOf() 메소드와 subString() 메소드를 함께 사용ㅎ면 유용
		// indexOf() 메소드로 문자열의 위치를 찾은 후 subStirng() 문자열을 자름
		int position3 = str.indexOf("G");
		int position4 = str.indexOf("O");
		String subStr3 = str.substring(position3, position4);
		System.out.println("subStr3:" + subStr3);

	}
}
