package 자바_코딩테스트_대비_입문.section02_array;

import java.util.Scanner;

public class P24_격자판최대합 {
	public int solution(int n, int[][] input) {
		int answer = 0;
		int[] a = new int[n], b = new int[n];
		int c = 0, d = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i] += input[i][j];
				b[i] += input[j][i];
			}

			c += input[i][i];
			d += input[n - 1 - i][i];
		}

		for (int i = 0; i < n; i++) {
			answer = Math.max(answer, a[i]);
			answer = Math.max(answer, b[i]);
		}
		answer = Math.max(answer, c);
		answer = Math.max(answer, d);
		return answer;
	}

	public static void main(String[] args) {
		P24_격자판최대합 T = new P24_격자판최대합();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] input = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				input[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(n, input));
	}
}
