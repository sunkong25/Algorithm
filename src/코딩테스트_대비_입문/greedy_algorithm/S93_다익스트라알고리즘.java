package 코딩테스트_대비_입문.greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Graph implements Comparable<Graph> {
	public int edge, weight;

	public Graph(int edge, int weight) {
		this.edge = edge;
		this.weight = weight;
	}

	@Override
	public int compareTo(Graph graph) {
		return this.weight - graph.weight;
	}
}

public class S93_다익스트라알고리즘 {
	static int n, m;
	static int[] dist;
	static ArrayList<ArrayList<Graph>> graph;

	public void solution(int v) {
		PriorityQueue<Graph> pQ = new PriorityQueue<>();

		pQ.offer(new Graph(v, 0));
		dist[v] = 0;

		while (!pQ.isEmpty()) {
			Graph cg = pQ.poll();
			int now = cg.edge;
			int nowWeight = cg.weight;

			if (nowWeight > dist[now]) {
				continue;
			}
			for (Graph ng : graph.get(now)) {
				if (dist[ng.edge] > nowWeight + ng.weight) {
					dist[ng.edge] = nowWeight + ng.weight;
					pQ.offer(new Graph(ng.edge, ng.weight + nowWeight));
				}
			}
		}
	}

	public static void main(String[] args) {
		S93_다익스트라알고리즘 T = new S93_다익스트라알고리즘();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Graph>>();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Graph>());
		}
		dist = new int[n + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);

		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();

			graph.get(start).add(new Graph(end, weight));
		}

		T.solution(1);

		for (int i = 2; i <= n; i++) {
			if (dist[i] != Integer.MAX_VALUE) {
				System.out.println(i + " : " + dist[i]);
			} else {
				System.out.println(i + " : impossible");
			}
		}
	}
}
