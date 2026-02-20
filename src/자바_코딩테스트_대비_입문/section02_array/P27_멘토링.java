package 자바_코딩테스트_대비_입문.section02_array;

import java.util.Scanner;

public class P27_멘토링 {
	public int solution(int n, int m, int[][] score) {
		int answer = 0;
		int[][] a = new int[m][n];

		for (int i = 1; i <= n; i++) {
			for (int j = 1 ; j <= n; j++) {
				int cnt = 0;
				for (int k = 0; k < m; k++) {
					int pi = 0, pj =0;
					for (int s = 0; s < n; s++) {
						if(score[k][s] == i) pi = s;
						if(score[k][s] == j) pj = s;
					}
					if(pi > pj){
						cnt++;
					}
				}
				if (cnt == m) {
					answer++;
				}
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		P27_멘토링 T = new P27_멘토링();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] score = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				score[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(n, m, score));
	}
}
