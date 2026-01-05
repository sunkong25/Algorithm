package 코딩테스트_대비_입문.string;

import java.util.Scanner;

public class P05_대소문자변환 {
	public String solution(String input) {
		String answer = "";

		for (char c : input.toCharArray()) {
			/*if (Character.isUpperCase(c)) {
				answer = answer + Character.toLowerCase(c);
			} else {
				answer = answer + Character.toUpperCase(c);
			}*/

			if (c >= 97 && c <= 122) answer += (char) (c - 32);
			else answer += (char) (c+32);
		}

		return answer;
	}

	public static void main(String[] args) {
		P05_대소문자변환 T = new P05_대소문자변환();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
