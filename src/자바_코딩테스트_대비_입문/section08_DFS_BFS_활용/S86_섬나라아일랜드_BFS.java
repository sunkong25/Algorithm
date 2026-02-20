package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point86 {
	public int x, y;

	public Point86(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class S86_섬나라아일랜드_BFS {
	static int n;
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

	public void BFS(int x, int y, int[][] board) {
		Queue<Point86> Q = new LinkedList<>();
		Q.offer(new Point86(x, y));
		while (!Q.isEmpty()) {
			Point86 cp = Q.poll();

			for (int i = 0; i < 8; i++) {
				int nx = cp.x + dx[i];
				int ny = cp.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					Q.offer(new Point86(nx, ny));
				}
			}
		}
	}

	public int solution(int[][] board) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					BFS(i, j, board);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		S86_섬나라아일랜드_BFS T = new S86_섬나라아일랜드_BFS();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(arr));
	}
}
