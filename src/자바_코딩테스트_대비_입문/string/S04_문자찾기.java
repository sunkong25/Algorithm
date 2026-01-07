package 자바_코딩테스트_대비_입문.string;

import java.util.Scanner;

public class S04_문자찾기 {
	public int solution(String input, char t) {
		int answer = 0;
		input = input.toLowerCase();
		t = Character.toLowerCase(t);

		/*for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == t) {
				answer++;
			}
		}*/

		for (char c : input.toCharArray()) {
			if(c == t) answer++;
		}

		return answer;
	}
	public static void main(String[] args) {
		S04_문자찾기 T = new S04_문자찾기();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		char c = sc.next().charAt(0);

		System.out.println(T.solution(input, c));
	}
}
