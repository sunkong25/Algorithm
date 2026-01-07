package 자바_코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P74_바둑이승차 {
	static int[] w;
	static int c, n, max;

	public void DFS(int L, int sum) {
		if (L == n) {
			if (c > sum) {
				max = Math.max(max, sum);
			}
		} else {
			DFS(L + 1, sum + w[L]);
			DFS(L + 1, sum);
		}
	}
	public static void main(String[] args) {
		P74_바둑이승차 T = new P74_바둑이승차();
		Scanner sc = new Scanner(System.in);

		c = sc.nextInt();
		n = sc.nextInt();
		w = new int[n+1];

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}

		T.DFS(0, 0);
		System.out.println(max);
	}
}
