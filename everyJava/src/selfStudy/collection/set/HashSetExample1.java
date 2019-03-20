package selfStudy.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("Jdbc");
		set.add("Servlet/Jsp");
		set.add("Java"); // 대소문자 구분, 빈칸은 글자로 인식
		set.add("iBatis");

		int size = set.size();
		System.out.println("총 객체수:" + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.remove("Jdbc");
		set.remove("iBatis");

		System.out.println("총 객체수: " + set.size());

		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비었음");
		}

	}
}
