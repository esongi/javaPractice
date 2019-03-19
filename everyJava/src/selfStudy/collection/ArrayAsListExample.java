package selfStudy.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		// Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴
		// asList()로 List를 생성하면 원소를 새롭게 추가할 수 없음

		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		// List<String> list5 = new ArrayList<>();
		for (String name : list1) {
			System.out.println(name);
		}
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
	}
}
