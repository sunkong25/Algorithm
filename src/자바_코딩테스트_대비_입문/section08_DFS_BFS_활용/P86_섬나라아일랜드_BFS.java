package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class P86_섬나라아일랜드_BFS {
	static int n;
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[][] board, dis;

	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		while (!Q.isEmpty()) {
			Point cp = Q.poll();

			for (int i = 0; i < 8; i++) {
				int nx = cp.x + dx[i];
				int ny = cp.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1 && dis[nx][ny] == 0) {
					dis[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
				}
			}
		}
	}

	public static void main(String[] args) {
		P86_섬나라아일랜드_BFS T = new P86_섬나라아일랜드_BFS();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		board = new int[n][n];
		dis = new int[n][n];
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1 && dis[i][j] == 0) {
					T.BFS(i, j);
					answer++;
				}
			}
		}

		System.out.println(answer);
	}
}
