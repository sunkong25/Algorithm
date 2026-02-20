package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class P12_숫자만추출 {
	public int solution(String input) {
		int answer = 0;

		input = input.toUpperCase().replaceAll("[A-Z]", "");
		answer = Integer.parseInt(input);
		return answer;
	}
	public static void main(String[] args) {
		P12_숫자만추출 T = new P12_숫자만추출();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
