package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P78_순열구하기 {
	static int n, m;
	static int[] pm;

	public void DFS(int L, int j, int[] arr) {
		if (L == m) {
			for (int i : pm) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				if (i == j) continue;
				pm[L] = arr[i];
				DFS(L+1, i, arr);
			}
		}
	}
	public static void main(String[] args) {
		P78_순열구하기 T = new P78_순열구하기();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] arr = new int[n+1];
		pm = new int[m];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		T.DFS(0, 0, arr);
	}
}
