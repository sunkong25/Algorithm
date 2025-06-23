package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class P06_중복문자제거 {
	public String solution(String input) {
		StringBuilder answer = new StringBuilder(input);
		for (int i = 1; i < answer.length(); i++) {
			for (int j = 0; j < i; j++) {
				if(answer.charAt(i) == answer.charAt(j)){
					answer.deleteCharAt(i);
					i--;
				};
			}
		}
		return answer.toString();
	}
	public static void main(String[] args) {
		P06_중복문자제거 T = new P06_중복문자제거();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
