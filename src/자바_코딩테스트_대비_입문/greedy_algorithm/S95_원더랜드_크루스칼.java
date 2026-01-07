package 자바_코딩테스트_대비_입문.greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Vertex implements Comparable<Vertex> {
	int v1, v2, cost;

	public Vertex(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}

	@Override
	public int compareTo(Vertex vertex) {
		return this.cost - vertex.cost;
	}
}

public class S95_원더랜드_크루스칼 {
	static ArrayList<Vertex> graph;
	static int[] unf;
	static int v, e;

	static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if (fa != fb) {
			unf[fa] = fb;
		}
	}

	static int Find(int v) {
		if (v == unf[v])
			return v;
		else {
			return unf[v] = Find(unf[v]);
		}
	}

	public int solution() {
		int answer = 0;
		Collections.sort(graph);
		for (Vertex v : graph) {
			int fa = Find(v.v1);
			int fb = Find(v.v2);
			if(fa == fb) continue;
			Union(fa, fb);
			answer += v.cost;
		}
		return answer;
	}

	public static void main(String[] args) {
		S95_원더랜드_크루스칼 T = new S95_원더랜드_크루스칼();
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		e = sc.nextInt();
		graph = new ArrayList<>();
		unf = new int[v + 1];
		for (int i = 1; i <= v; i++) {
			unf[i] = i;
		}

		for (int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();

			graph.add(new Vertex(v1, v2, cost));
		}

		System.out.println(T.solution());
	}
}
