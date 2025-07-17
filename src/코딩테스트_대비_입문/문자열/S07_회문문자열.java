package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class S07_회문문자열 {
	public String solution(String input) {
		// 1번째 방법 -> for문 이용하여 하나씩 비교
		/*String answer = "YES";
		input = input.toUpperCase();
		int len = input.length();
		for (int i = 0; i < len / 2; i++) {
			if (input.charAt(i) != input.charAt(len - i - 1)) {
				return "NO";
			}
		}*/
		String answer = "NO";
		String reverse = new StringBuilder(input).reverse().toString();
		if (input.equalsIgnoreCase(reverse)) {
			answer = "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		S07_회문문자열 T = new S07_회문문자열();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
