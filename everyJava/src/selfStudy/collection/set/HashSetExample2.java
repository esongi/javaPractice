package selfStudy.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		for(Member member : set) {
			System.out.println(member);
		}
		
		// equlas 메서드와 hashCode() 메서드를 재정의 해줬기때문에 가능
		System.out.println("총 객체수: " + set.size());
	}
}
