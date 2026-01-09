package 자바_코딩테스트_대비_입문.string;

import java.util.Scanner;

public class S14_문자열압축 {
	public String solution(String input) {
		String answer = "";
		input = input + " ";
		int cnt = 1;
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				cnt++;
			} else {
				answer += input.charAt(i);
				if (cnt > 1) {
					answer += cnt;
				}
				cnt = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		S14_문자열압축 T = new S14_문자열압축();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
