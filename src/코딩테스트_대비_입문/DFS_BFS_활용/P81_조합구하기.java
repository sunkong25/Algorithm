package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P81_조합구하기 {
	static int n, m;
	static int[] pm, ch;

	public void DFS(int L) {
		if (L == m) {
			for (int i : pm) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = pm[L-1 == -1 ? 0: L-1]+1; i <= n; i++) {
					pm[L] = i;
					DFS(L + 1);
			}
		}
	}

	public static void main(String[] args) {
		P81_조합구하기 T = new P81_조합구하기();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];
		ch = new int[n + 1];

		T.DFS(0);

	}
}
