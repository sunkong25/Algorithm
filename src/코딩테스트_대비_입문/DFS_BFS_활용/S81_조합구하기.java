package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class S81_조합구하기 {
	static int n, m;
	static int[] pm;

	public void DFS(int L, int S) {
		if (L == m) {
			for (int i : pm) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = S; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		S81_조합구하기 T = new S81_조합구하기();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];

		T.DFS(0, 1);
	}
}
