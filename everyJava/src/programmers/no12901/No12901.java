package programmers.no12901;

import java.util.Calendar;
import java.util.Locale;

public class No12901 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int a = 5, b = 24;
		System.out.println(sol.solution(a, b));
	}
}

class Solution {
	public String solution(int month, int day) {
		Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
	}
}
