package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P85_섬나라아일랜드_DFS {
	static int[][] board, dis;
	static int n;
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

	public void DFS(int x, int y) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1 && dis[nx][ny] == 0) {
				dis[nx][ny] = 1;
				DFS(nx, ny);
			}
		}
	}
	public static void main(String[] args) {
		P85_섬나라아일랜드_DFS T = new P85_섬나라아일랜드_DFS();
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
					T.DFS(i, j);
					answer++;
				}
			}
		}

		System.out.println(answer);
	}
}
