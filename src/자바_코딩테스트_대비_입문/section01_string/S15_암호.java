package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class S15_암호 {
	public String solution(int n, String input) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			String s = input.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(s, 2);
			answer += (char) num;
			input = input.substring(7);
		}
		return answer;
	}
	public static void main(String[] args) {
		S15_암호 T = new S15_암호();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String input = sc.next();

		System.out.println(T.solution(n, input));
	}
}
