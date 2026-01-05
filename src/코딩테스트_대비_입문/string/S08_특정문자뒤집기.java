package 코딩테스트_대비_입문.string;

import java.util.Scanner;

public class S08_특정문자뒤집기 {
	public String solution(String input) {
		String answer = "";
		char[] c = input.toCharArray();
		int lt = 0, rt = c.length - 1;
		while (lt < rt) {
			if (!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}

	public static void main(String[] args) {
		S08_특정문자뒤집기 T = new S08_특정문자뒤집기();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
