package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class P05_특정문자뒤집기 {
	public String solution(String str) {
		String answer = "";
		int lt = 0, rt = str.length()-1;
		char[] c = str.toCharArray();
		while (lt < rt) {
			if (Character.isLetter(c[lt]) && Character.isLetter(c[rt])) {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++; rt--;
			} else if (Character.isLetter(c[lt]) && !Character.isLetter(c[rt])) {
				rt--;
			} else if (!Character.isLetter(c[lt]) && Character.isLetter(c[rt])) {
				lt++;
			} else {
				lt++; rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	public static void main(String[] args) {
		P05_특정문자뒤집기 T = new P05_특정문자뒤집기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
