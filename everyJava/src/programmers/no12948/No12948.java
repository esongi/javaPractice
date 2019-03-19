package programmers.no12948;

public class No12948 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("01033334444"));
	}
}

class Solution {
	public String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();
		for (int i = 0; i < ch.length - 4; i++) {
			ch[i] = '*';
		}
		return String.valueOf(ch);
	}
}