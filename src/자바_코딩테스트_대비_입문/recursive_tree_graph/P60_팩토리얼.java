package 자바_코딩테스트_대비_입문.recursive_tree_graph;

import java.util.Scanner;

public class P60_팩토리얼 {
	public int DFS(int n) {
		if (n == 1) {
			return 1;
		}
		return n * DFS(n - 1);
	}

	public static void main(String[] args) {
		P60_팩토리얼 T = new P60_팩토리얼();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(T.DFS(N));
	}
}
