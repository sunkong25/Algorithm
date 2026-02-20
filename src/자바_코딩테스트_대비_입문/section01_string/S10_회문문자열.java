package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class S10_회문문자열 {
	public String solution(String input) {
		String answer = "NO";
		String str = new StringBuilder(input).reverse().toString();

		if (input.equalsIgnoreCase(str)) {
			answer = "YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		S10_회문문자열 T = new S10_회문문자열();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
