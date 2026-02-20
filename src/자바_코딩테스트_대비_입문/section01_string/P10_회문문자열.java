package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class P10_회문문자열 {
	public String solution(String input) {
		String answer = "YES";
		input = input.toUpperCase();

		int lt = 0, rt = input.length() - 1;
		while (lt < rt) {
			if (input.charAt(lt) != input.charAt(rt)) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}

		return answer;
	}
	public static void main(String[] args) {
		P10_회문문자열 T = new P10_회문문자열();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
