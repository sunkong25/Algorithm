package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P75_최대점수구하기 {
	static int n, m, maxScore=Integer.MIN_VALUE;
	public void DFS(int L, int score, int time, int[][] arr) {
		if (time > m) return;
		if (L == n) {
			maxScore = Math.max(score, maxScore);
		} else {
			DFS(L+1, score+arr[L][0], time+arr[L][1], arr);
			DFS(L+1, score, time, arr);
		}
	}
	public static void main(String[] args) {
		P75_최대점수구하기 T = new P75_최대점수구하기();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] exam = new int[n][2];
		for (int i = 0; i < n; i++) {
			exam[i][0] = sc.nextInt();
			exam[i][1] = sc.nextInt();
		}
		T.DFS(0, 0, 0, exam);
		System.out.println(maxScore);
	}
}
