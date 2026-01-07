package 자바_코딩테스트_대비_입문.string;

import java.util.Scanner;

public class P09_중복문자제거 {
	public String solution(String input) {
		String answer = "";
		char[] c = input.toCharArray();

		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					c[j] = '*';
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] != '*') {
				answer += c[i];
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		P09_중복문자제거 T = new P09_중복문자제거();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
