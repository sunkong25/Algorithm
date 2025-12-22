
package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P75_중복순열 {
	static int n, m;
	static int[] s;

	public void DFS(int L) {
		if (L == m) {
			for (int i : s) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				s[L] = i;
				DFS(L + 1);
			}
		}
	}

	public static void main(String[] args) {
		P75_중복순열 T = new P75_중복순열();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		s = new int[m];
		T.DFS(0);
	}
}
