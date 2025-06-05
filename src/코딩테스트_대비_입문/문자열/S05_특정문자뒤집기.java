package 코딩테스트_대비_입문.문자열;

import java.util.*;

public class S05_특정문자뒤집기 {
	public String solution(String str) {
		String answer = "";
		int lt = 0, rt = str.length() - 1;
		char[] c = str.toCharArray();
		while (lt < rt) {
			if (!Character.isAlphabetic(c[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(c[rt])) {
				rt--;
			} else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++; rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	public static void main(String[] args) {
		S05_특정문자뒤집기 T = new S05_특정문자뒤집기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
