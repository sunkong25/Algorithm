package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class S11_필랜드롬 {
	public String solution(String input) {
		String answer = "NO";
		input = input.toUpperCase().replaceAll("[^A-Z]", "");
		String str = new StringBuilder(input).reverse().toString();

		if (input.equals(str)) {
			answer = "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		S11_필랜드롬 T = new S11_필랜드롬();
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		System.out.println(T.solution(input));
	}
}
