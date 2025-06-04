package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class P04_단어뒤집기 {
	public StringBuffer solution(String word) {
		StringBuffer sb = new StringBuffer(word);
		return sb.reverse();
	}
	public static void main(String[] args) {
		P04_단어뒤집기 T = new P04_단어뒤집기();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			String word = sc.next();
			System.out.println(T.solution(word));
		}
	}
}
