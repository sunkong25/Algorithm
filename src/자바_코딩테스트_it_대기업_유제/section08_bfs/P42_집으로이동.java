package 자바_코딩테스트_it_대기업_유제.section08_bfs;

import java.util.LinkedList;
import java.util.Queue;

class Move {
	public int point;
	public char direction;

	public Move(int point, char direction) {
		this.point = point;
		this.direction = direction;
	}
}

public class P42_집으로이동 {
	public int solution(int[] pool, int a, int b, int home) {
		int answer = 0;
		int[] ch = new int[10001];
		Queue<Move> Q = new LinkedList<>();
		for (int i = 0; i < pool.length; i++) {
			ch[pool[i]] = 1;
		}

		Q.offer(new Move(0, 'f'));
		ch[0] = 1;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Move m = Q.poll();
				if (m.point == home) {
					return answer;
				}
				int nx1 = m.point + a;
				int nx2 = m.point - b;
				if (nx2 >= 0 && m.direction == 'f' && ch[nx2] == 0) {
					ch[nx2] = 1;
					Q.offer(new Move(nx2, 'b'));
				}
				if (ch[nx1] == 0) {
					ch[nx1] = 1;
					Q.offer(new Move(nx1, 'f'));
				}
			}
			answer++;
		}

		return -1;
	}

	public static void main(String[] args) {
		P42_집으로이동 T = new P42_집으로이동();
		System.out.println(T.solution(new int[]{11, 7, 20}, 3, 2, 10));
		System.out.println(T.solution(new int[]{1, 15, 11}, 3, 2, 5));
		System.out.println(T.solution(new int[]{9, 15, 35, 30, 20}, 2, 1, 25));
		System.out.println(T.solution(new int[]{5, 12, 7, 19, 23}, 3, 5, 18));
		System.out.println(T.solution(new int[]{10, 15, 20}, 3, 2, 2));
	}
}
