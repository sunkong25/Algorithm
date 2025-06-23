package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class S06_중복문자제거 {
	public String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		S06_중복문자제거 T = new S06_중복문자제거();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
