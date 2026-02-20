package 자바_코딩테스트_대비_입문.section07_recursive_tree_graph;

import java.util.ArrayList;
import java.util.Scanner;

public class P70_경로탐색_ArrayList {
	static ArrayList<ArrayList<Integer>> v;
	static int[] chk;
	static int answer = 0, n, m;

	public void DFS(int e) {
		if (e == n) {
			answer++;
		} else {
			for (int nv : v.get(e)) {
				if (chk[nv] == 0) {
					chk[nv] = 1;
					DFS(nv);
					chk[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		P70_경로탐색_ArrayList T = new P70_경로탐색_ArrayList();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = new ArrayList<ArrayList<Integer>>();
		chk = new int[n + 1];
		for (int i = 0; i < n; i++) {
			v.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			v.get(a).add(b);
		}
		chk[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
