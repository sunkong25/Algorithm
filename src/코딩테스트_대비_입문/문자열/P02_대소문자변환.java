package 코딩테스트_대비_입문.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02_대소문자변환 {
	public List<Character> solution(String input) {
		List<Character> answer = new ArrayList<>();
		for (char x : input.toCharArray()) {
			if (Character.isUpperCase(x)) {
				answer.add(Character.toLowerCase(x));
			} else {
				answer.add(Character.toUpperCase(x));
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		P02_대소문자변환 T = new P02_대소문자변환();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (Character ans : T.solution(input)) {
			System.out.print(ans);
		}
	}
}
