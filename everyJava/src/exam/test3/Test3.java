package exam.test3;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {

	// 매개 변수가 있는 생성자가 있을 때는, 기본 생성자를 자동으로 만들지 않는다
	// 1) 부모의 기본 생성자를 미리 만들거나,
	// 2) 매개 변수가 포함되는 생성자로 만들어야 한다.
	Tv(int price) {
		super(price);
	}

	public String toString() {
		return "Tv";
	}
}

class Test3 {
	public static void main(String[] args) {
		Tv t = new Tv(18);
	}
}
