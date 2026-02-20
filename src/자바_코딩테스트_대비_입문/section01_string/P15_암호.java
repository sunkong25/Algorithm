package 자바_코딩테스트_대비_입문.section01_string;

import java.util.Scanner;

public class P15_암호 {
	public String solution(int n, String input) {
		String answer = "";
		input = input.replaceAll("#", "1");
		input = input.replaceAll("[*]", "0");
		String[] key = new String[n];

		for (int i = 0; i < n; i++) {
			key[i] = input.substring(i * 7, (i + 1) * 7);
		}
		for (String k : key) {
			int kn = 0;
			for (int i = 0; i < 7; i++) {
				kn = kn + (int)(Math.pow(2, 7 - i-1) * (k.charAt(i)-48));
			}
			answer += (char) kn;
		}
		return answer;
	}
	public static void main(String[] args) {
		P15_암호 T = new P15_암호();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String input = sc.next();
		System.out.println(T.solution(n, input));
	}
}
