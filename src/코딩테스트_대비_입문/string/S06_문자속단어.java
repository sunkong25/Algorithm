package 코딩테스트_대비_입문.string;

import java.util.Scanner;

public class S06_문자속단어 {
	/*public String solution(String input) {
		String answer = "";
		String[] str = input.split(" ");
		int m = Integer.MIN_VALUE;
		for (String s : str) {
			int len = s.length();
			if (m < len) {
				m = len;
				answer = s;
			}
		}

		return answer;
	}*/
	public String solution(String input) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;


		while ((pos = input.indexOf(" ")) != -1) {
			String tmp = input.substring(0, pos);
			int len = tmp.length();

			if (m < len) {
				m = len;
				answer = tmp;
			}

			input = input.substring(pos + 1);
		}

		if (m < input.length()) answer = input;
		return answer;
	}
	public static void main(String[] args) {
		S06_문자속단어 T = new S06_문자속단어();
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		System.out.println(T.solution(input));
	}
}
