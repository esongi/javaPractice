package selfStudy.generic;

public class Util {
	public static <T> Box2<T> boxing(T t) {
		Box2<T> box2 = new Box2<>();
		box2.set(t);
		return box2;
	}
}
