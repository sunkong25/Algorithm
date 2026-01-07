package 자바_코딩테스트_대비_입문.recursive_tree_graph;

import java.util.Scanner;

public class P69_경로탐색_DFS {
	static int[][] v;
	static int[] chk;
	static int answer = 0, n, m;

	public void DFS(int e) {
		if (e == n) {
			answer++;
		} else {
			for (int i = 1; i <= n; i++) {
				if (v[e][i] == 1 && chk[i] == 0) {
					chk[i] = 1;
					DFS(i);
					chk[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		P69_경로탐색_DFS T = new P69_경로탐색_DFS();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = new int[n + 1][n + 1];
		chk = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			v[a][b] = 1;
		}
		chk[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
