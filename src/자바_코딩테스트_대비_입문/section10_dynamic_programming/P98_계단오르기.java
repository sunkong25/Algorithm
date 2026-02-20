package 자바_코딩테스트_대비_입문.section10_dynamic_programming;

import java.util.Scanner;

public class P98_계단오르기 {
	public int solution(int n) {
		int[] s = new int[n + 1];
		s[1] = 1;
		s[2] = 2;
		for (int i = 3; i <= n; i++) {
			s[i] = s[i - 2] + s[i - 1];
		}
		return s[n];
	}
	public static void main(String[] args) {
		P98_계단오르기 T = new P98_계단오르기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}
