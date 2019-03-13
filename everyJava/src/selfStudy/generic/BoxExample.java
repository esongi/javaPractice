package selfStudy.generic;

public class BoxExample {

	public static void main(String[] args) {
		Box1 box = new Box1();
		
		// String 타입을 Object 타입으로 자동 타입 변환해서 저장
		box.set("홍길동"); 
		// Object 타입을 String 타입으로 강제 타입 변환해서 얻음
		String name = (String) box.get(); 

		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}
}
