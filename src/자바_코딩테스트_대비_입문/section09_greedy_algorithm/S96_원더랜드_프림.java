package 자바_코딩테스트_대비_입문.section09_greedy_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	public int vertex, cost;

	public Edge(int vertex, int cost) {
		this.vertex = vertex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		return this.cost- e.cost;
	}
}

public class S96_원더랜드_프림 {
	static ArrayList<ArrayList<Edge>> edge = new ArrayList<>();
	static int[] check;

	public int solution(int v) {
		int answer = 0;
		PriorityQueue<Edge> pQ = new PriorityQueue<>();

		check[v] = 1;
		for (Edge e : edge.get(v)) {
			pQ.offer(e);
		}

		while (!pQ.isEmpty()) {
			Edge cE = pQ.poll();
			int now = cE.vertex;
			int nowCost = cE.cost;

			if (check[now] == 0) {
				check[now] = 1;
				answer += nowCost;
				for (Edge nE : edge.get(now)) {
					if(check[nE.vertex] == 0) pQ.offer(nE);
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		S96_원더랜드_프림 T = new S96_원더랜드_프림();
		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();
		int e = sc.nextInt();
		check = new int[v + 1];

		for (int i = 0; i <= v; i++) {
			edge.add(new ArrayList<Edge>());
		}

		for (int i = 0; i < e; i++) {
			int v1 =sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();

			edge.get(v1).add(new Edge(v2, cost));
			edge.get(v2).add(new Edge(v1, cost));
		}

		System.out.println(T.solution(1));
	}
}
