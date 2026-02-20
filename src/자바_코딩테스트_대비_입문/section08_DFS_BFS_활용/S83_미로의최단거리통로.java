package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class xy {
	public int x, y;

	xy(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class S83_미로의최단거리통로 {
	static int[][] board = new int[8][8], dist = new int[8][8];
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};

	public void BFS(int x, int y) {
		Queue<xy> Q = new LinkedList<>();
		Q.offer(new xy(x, y));
		board[x][y] = 1;
		while (!Q.isEmpty()) {
			xy point = Q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = point.x + dx[i];
				int ny = point.y + dy[i];

				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new xy(nx, ny));
					dist[nx][ny] = dist[point.x][point.y] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		S83_미로의최단거리통로 T = new S83_미로의최단거리통로();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		T.BFS(1, 1);
		if (dist[7][7] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(dist[7][7]);
		}
	}
}
