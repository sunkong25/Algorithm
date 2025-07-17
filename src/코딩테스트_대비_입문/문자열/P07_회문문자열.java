package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class P07_회문문자열 {
	public String solution(String input) {
		String answer = "YES";
		int lt = 0, rt = input.length() - 1;
		input = input.toLowerCase();
		while (lt < rt) {
			if (input.charAt(lt) != input.charAt(rt)) {
				answer = "NO";
			}
			lt++; rt--;
		}
		return answer;
	}

	public static void main(String[] args) {
		P07_회문문자열 T = new P07_회문문자열();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
