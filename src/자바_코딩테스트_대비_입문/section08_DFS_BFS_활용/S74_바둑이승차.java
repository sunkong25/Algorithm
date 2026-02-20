package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.Scanner;

public class S74_바둑이승차 {
	static int max = Integer.MIN_VALUE, c, n;

	public void DFS(int L, int sum, int[] arr) {
		if (sum > c) return;
		if (L == n) {
			max = Math.max(max, sum);
		}else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) {
		S74_바둑이승차 T = new S74_바둑이승차();
		Scanner sc = new Scanner(System.in);

		c = sc.nextInt();
		n = sc.nextInt();
		int[] w = new int[n];

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}

		T.DFS(0, 0, w);
		System.out.println(max);
	}
}
