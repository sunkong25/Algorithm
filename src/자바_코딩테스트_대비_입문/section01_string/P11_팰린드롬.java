package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class P11_팰린드롬 {
	public String solution(String input) {
		String answer = "NO";

		input = input.replaceAll("[^\\w]", "");
		String str = new StringBuilder(input).reverse().toString();
		if (input.equalsIgnoreCase(str)) {
			answer = "YES";
		}

		return answer;
	}

	public static void main(String[] args) {
		P11_팰린드롬 T = new P11_팰린드롬();
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		System.out.println(T.solution(input));
	}
}
