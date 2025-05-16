package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class P03_문장속단어 {
	public String solution(String[] words) {
		String answer = "";
		for (String word : words) {
			if (answer.length() < word.length()) {
				answer = word;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		P03_문장속단어 T = new P03_문장속단어();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.split(" ");
		System.out.println(T.solution(words));
	}
}
