package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class S03_문장속단어 {
	public String solution(String words) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		while (((pos = words.indexOf(' ')) != -1)) {
			String tmp = words.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m=len;
				answer = tmp;
			}
			words = words.substring(pos + 1);
		}
		if (words.length() > m) {
			answer = words;
		}
		return answer;
	}
	public static void main(String[] args) {
		S03_문장속단어 T = new S03_문장속단어();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(T.solution(input));
	}
}
