package 자바_코딩테스트_대비_입문.DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato{
	public int x, y;

	public Tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class P84_토마토 {
	static int m, n, answer;
	static int[][] t;
	static Queue<Tomato> Q= new LinkedList<>();
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean flag = true;

	public void BFS() {
		while (!Q.isEmpty()) {
			Tomato ct = Q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = ct.x + dx[i];
				int ny = ct.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && t[nx][ny] == 0) {
					Q.offer(new Tomato(nx, ny));
					t[nx][ny] = t[ct.x][ct.y] + 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		P84_토마토 T = new P84_토마토();
		Scanner sc = new Scanner(System.in);

		m = sc.nextInt();
		n = sc.nextInt();
		t = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				t[i][j] = sc.nextInt();
				if (t[i][j] == 1) {
					Q.offer(new Tomato(i, j));
				}
			}
		}

		T.BFS();
		for (int i = 0; i < n; i++) {
			if(!flag) break;
			for (int j = 0; j < m; j++) {
				if(t[i][j] == 0){
					flag = false;
					break;
				}
				answer = Math.max(answer, t[i][j]);
			}
		}
		if (!flag) {
			System.out.println(-1);
		} else {
			System.out.println(answer - 1);
		}
	}
}
