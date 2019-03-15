package exam.test5;

public class TwoSum3 {

	public static void main(String[] args) {

		System.out.println(retFunc(10));
	}

	static int retFunc(int num) {

		if (num == 2) {
			return num;
		}
		return num + retFunc(num - 2);
	}
}
