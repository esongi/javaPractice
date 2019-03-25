package selfStudy.stringSplit;

import java.util.Scanner;

public class stringSplitEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] split = a.split("");
		System.out.println(split[0]);
		sc.close();
	}
}
