package 자바_코딩테스트_it_대기업_유제.section08_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class S42_집으로이동 {
	public int solution(int[] pool, int a, int b, int home) {
		Queue<int[]> Q = new LinkedList<>();
		int[][] ch = new int[10001][2];
		for (int x : pool) {
			ch[x][0] = 1;
			ch[x][1] = 1;
		}
		Q.offer(new int[]{0, 0});
		ch[0][0] = 1;
		ch[0][1] = 1;

		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int[] m = Q.poll();
				if(m[0] == home) return L;
				int nx = m[0] + a;
				if (nx <= 10001 && ch[nx][0] == 0) {
					ch[nx][0] = 1;
					Q.offer(new int[]{nx, 0});
				}
				int ny = m[0] - b;
				if (ny >= 0 && m[1] == 0 && ch[ny][1] == 0) {
					ch[ny][1] = 1;
					Q.offer(new int[]{ny, 1});
				}
			}
			L++;
		}
		return -1;
	}

	public static void main(String[] args) {
		S42_집으로이동 T = new S42_집으로이동();
		System.out.println(T.solution(new int[]{11, 7, 20}, 3, 2, 10));
		System.out.println(T.solution(new int[]{1, 15, 11}, 3, 2, 5));
		System.out.println(T.solution(new int[]{9, 15, 35, 30, 20}, 2, 1, 25));
		System.out.println(T.solution(new int[]{5, 12, 7, 19, 23}, 3, 5, 18));
		System.out.println(T.solution(new int[]{10, 15, 20}, 3, 2, 2));
	}
}
