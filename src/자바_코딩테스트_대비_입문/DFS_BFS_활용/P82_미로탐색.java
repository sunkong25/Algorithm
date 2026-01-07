package 자바_코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.Scanner;

public class P82_미로탐색 {
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int[][] v = new int[8][8], m = new int[8][8];
	static int answer = 0;

	public void DFS(int x, int y) {
		if (x == 7 && y == 7) {
			answer++;
		} else {
			for (int i = 0; i < 4; i++) {
				if (x > 0 && y > 0 && x <= 7 && y <= 7 && v[x][y] == 0 && m[x][y] == 0) {
					v[x][y] = 1;
					DFS(x + dx[i], y + dy[i]);
					v[x][y] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		P82_미로탐색 T = new P82_미로탐색();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				m[i][j] = sc.nextInt();
			}
		}

		T.DFS(1, 1);
		System.out.println(answer);
	}
}

