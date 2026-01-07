package 자바_코딩테스트_대비_입문.string;

import java.util.Scanner;

public class S09_중복문자제거 {
	public String solution(String input) {
		String answer = "";

		for (int i = 0; i < input.length(); i++) {
			if (i == input.indexOf(input.charAt(i))) { //indexOf 가장 처음 만나는 문자의 인덱스 반환
				answer += input.charAt(i);
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		S09_중복문자제거 T = new S09_중복문자제거();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(T.solution(input));
	}
}
