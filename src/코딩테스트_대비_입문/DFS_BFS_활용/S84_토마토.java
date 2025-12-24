package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Stomato {
	public int x, y;

	public Stomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class S84_토마토 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static Queue<Stomato> Q = new LinkedList<>();
	static int[][] board, dist;

	public void BFS() {
		while (!Q.isEmpty()) {
			Stomato ct = Q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = ct.x + dx[i];
				int ny = ct.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Stomato(nx, ny));
					dist[nx][ny] = dist[ct.x][ct.y] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		S84_토마토 T = new S84_토마토();
		Scanner sc = new Scanner(System.in);

		m = sc.nextInt();
		n = sc.nextInt();
		board = new int[n][m];
		dist = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = sc.nextInt();
				if (board[i][j] == 1) {
					Q.offer(new Stomato(i, j));
				}
			}
		}

		T.BFS();

		int answer = Integer.MIN_VALUE;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (board[i][j] == 0) {
					flag = false;
				}
			}
		}

		if (flag) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					answer = Math.max(answer, dist[i][j]);
				}
			}
		} else {
			answer = -1;
		}

		System.out.println(answer);
	}
}
