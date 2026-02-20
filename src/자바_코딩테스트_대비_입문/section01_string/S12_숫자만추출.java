package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class S12_숫자만추출 {
	public int solution(String input) {
		String answer = "";

		/*for (char x : input.toCharArray()) {
			if (x >= 48 && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}*/

		for (char x : input.toCharArray()) {
			if (Character.isDigit(x)) {
				answer += x;
			}
		}

		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		S12_숫자만추출 T = new S12_숫자만추출();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
