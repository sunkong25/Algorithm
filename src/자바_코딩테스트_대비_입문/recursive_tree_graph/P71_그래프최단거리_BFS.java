package 자바_코딩테스트_대비_입문.recursive_tree_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P71_그래프최단거리_BFS {
	static int n, m;
	static int[] ch, dst;
	static ArrayList<ArrayList<Integer>> graph;

	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		dst[v] = 0;
		ch[v] = 1;
		Q.offer(v);
		while (!Q.isEmpty()) {
			int cv = Q.poll();
			for (int nv : graph.get(cv)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
					dst[nv] = dst[cv] + 1;
				}
			}
		}

	}
	public static void main(String[] args){
		P71_그래프최단거리_BFS T = new P71_그래프최단거리_BFS();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		ch = new int[n + 1];
		dst = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for (int i = 2; i < dst.length; i++) {
			System.out.println(dst[i]);
		}
	}
}
