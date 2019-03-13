package selfStudy.generic;

public class BoxExample2 {
	public static void main(String[] args) {
		Box2<String> b1 = new Box2<String>();
		b1.set("hello");
		String str = b1.get();

		Box2<Integer> b2 = new Box2<Integer>();
		b2.set(6);
		int value = b2.get();
	}
}
