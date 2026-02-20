package 자바_코딩테스트_대비_입문.section08_DFS_BFS_활용;

import java.util.Scanner;

public class S85_섬나라아일랜드_DFS {
	static int n;
	static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	public void DFS(int x, int y, int[][] board){
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}
	public int solution(int[][] board) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j] == 1){
					answer++;
					board[i][j] = 0;
					DFS(i, j, board);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		S85_섬나라아일랜드_DFS T = new S85_섬나라아일랜드_DFS();
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
