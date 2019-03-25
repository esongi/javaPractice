package total;

import java.io.UnsupportedEncodingException;

public class StringMethod {
	public static void main(String[] args) {
		String str = "JAVA Programming";
		String str2 = "학습 블로그";

		// charAt()
		// 매개값으로 주어진 인덱스의 문자를 리턴함
		// String을 이루고 있는 글자 하나하나를 char 배열 인덱스를 사용하듯이 다룰 수 있다
		char c = str.charAt(3);

		System.out.println("str.charAt(3):" + c);
		System.out.println("str2.charAt(5):" + str2.charAt(5));

		System.out.println("==========");

		// valueOf()
		// 기본 타입의 값을 문자열로 변환하는 기능
		String str3 = String.valueOf(10);
		double a = 3.1415;
		String str4 = String.valueOf(a);
		String str5 = String.valueOf(true);
		System.out.println("str3:" + str3 + ", str4:" + str4 + ", str5:" + str5);

		System.out.println("=======");

		// getBytes()
		// 문자열을 바이트 배열로 변환
		// 네트워크로 문자열을 전송하거나, 문자열을 암호할 때 문자열을 바이트 배열로 변환함

		// 기본 문자셋으로 인코딩과 디코딩
		byte[] encodingBytes = str.getBytes();
		System.out.println("encodingBytes.length:" + encodingBytes.length);
		String decodingStr = new String(encodingBytes);
		System.out.println("encodingBytes->decodingStr:" + decodingStr);

		try {
			// ECU-KR 문자셋으로 인코딩과 디코딩
			byte[] encodingBytes2 = str.getBytes("EUC-KR");
			System.out.println("encodingBytes2.length: " + encodingBytes2.length);
			String decodingStr2 = new String(encodingBytes2, "EUC-KR");
			System.out.println("encodingBytes2 -> decodingStr2: " + decodingStr2);

			// UTF-8 문자셋으로 인코딩과 디코딩
			byte[] encodingBytes3 = str.getBytes("UTF-8");
			System.out.println("encodingBytes3.length:" + encodingBytes3.length);
			String decodingStr3 = new String(encodingBytes3, "UTF-8");
			System.out.println("encodingBytes3 -> decodingtStr3:" + decodingStr3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}