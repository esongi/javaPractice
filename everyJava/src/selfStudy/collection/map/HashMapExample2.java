package selfStudy.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>(); // 오른쪽 제네릭 생략 가능

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);

		// 학번과 이름이 동일한 경우 같은 키로 인식하게끔
		System.out.println("총 Entry 수: " + map.size());
	}
}