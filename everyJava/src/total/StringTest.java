package total;

/**
 * @author USER 자바의 문자열은 java.lang 패키지의 String 클래스의 인스턴스로 관리. 소스상에서 문자열 리터럴은
 *         String 객체로 자동 생성되지만, String 클래스의 다양한 생성자를 이용해서 직접 String 객체를 생성 가능
 *         파일의 내용을 읽거나, 네트워크를 통해 받은 데이터는 보통 byte[] 배열이므로 이것을 문자열로 변환하기 위해 사용 ==
 *         ========================================== System.in.read() 메소드는
 *         키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에 저장하고 읽은 바이트 수를 리턴. Hello를 입력하고 Enter
 *         키를 눌렀다면 Hello + 캐리지리턴(\r)+라인피드 (\n)의 코드값이 바이트 배열에 저장되고 총 7개의 바이트를 읽었기
 *         떄문에 7을 리턴. 영어는 알파벳 한 자가 1바이트로 표현되지만, 한글과 기타 언어는 2바이트로 표현되기 때문에 입력된 문자
 *         수와 읽은 바이트 수가 다를 수 있다
 * 
 */
public class StringTest {
	public static void main(String[] args) throws Exception {
		// 배열 전체를 String 객체로 생성
		// String str = new String(byte[] bytes);
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str = new String(bytes);
		System.out.println(str);

		// 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
		// String str2 = new String(byte[] bytes, int offset, int length);
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

		// String 복사
		// String str4 = new String(String str3);
		String str3 = "abcd";
		String str4 = new String(str3);
		System.out.println(str4);

		System.out.println("============================");

		// 읽은 바이트를 저장하기 위한 배열
		byte[] bytes2 = new byte[100];

		System.out.println("입력");
		int readByteNo = System.in.read(bytes2);

		// 바이트 배열을 문자열로 변환
		// length 매개값으로 배열 길이에서 2를 뺴준 이윤ㄴ
		// 캐리지리턴 + 라인피드 부분은 문자열로 만들 필요가 없기 때문
		String byteStr = new String(bytes2, 0, readByteNo - 2);
		System.out.println(byteStr);
	}
}
