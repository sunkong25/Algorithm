package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class S79_조합의경우수 {
	static int[][] dy = new int[35][35];
	public int DFS(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if (n == r || r == 0) return 1;
		else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
	}
	public static void main(String[] args) {
		S79_조합의경우수 T = new S79_조합의경우수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(T.DFS(n, r));
	}
}
