package 코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P82_미로탐색 {
	static int[][] v = new int[8][8];
	static int answer = 0;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};

	public void DFS(int x, int y) {
		if (x == 7 && y == 7) {
			answer++;
		}
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && v[nx][ny] == 0) {
				v[nx][ny] = 1;
				DFS(nx, ny);
				v[nx][ny] = 0;
			}
		}
	}

	public static void main(String[] args) {
		P82_미로탐색 T = new P82_미로탐색();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				v[i][j] = sc.nextInt();
			}
		}

		v[1][1] = 1;
		T.DFS(1, 1);
		System.out.println(answer);
	}
}
