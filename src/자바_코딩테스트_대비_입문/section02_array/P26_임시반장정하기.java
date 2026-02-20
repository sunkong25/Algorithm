package 자바_코딩테스트_대비_입문.section02_array;

import java.util.Scanner;

public class P26_임시반장정하기 {
	static int[][] student;

	public int solution(int n) {
		int answer = 0, max = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= 5; k++) {
					if (student[i][k] == student[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		P26_임시반장정하기 T = new P26_임시반장정하기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		student = new int[n+1][6];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				student[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n));
	}
}
