package 자바_코딩테스트_it_대기업_유제.section08_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class S41_타일점프 {
	public int solution(int[] nums) {
		int n = nums.length;
		Queue<Integer> Q = new LinkedList<>();
		int[] ch = new int[n];
		Q.offer(0);
		ch[0] = 1;
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 1; j <= nums[x]; j++) {
					int nx = x + j;
					if (nx == n - 1) {
						return L + 1;
					}
					if (nx < n && ch[nx] == 0) {
						Q.offer(nx);
						ch[nx] = 1;
					}
				}
			}
			L++;
		}

		return -1;
	}

	public static void main(String[] args) {
		S41_타일점프 T = new S41_타일점프();
		System.out.println(T.solution(new int[]{2, 2, 1, 2, 1, 1}));
		System.out.println(T.solution(new int[]{1, 0, 1, 1, 3, 1, 2, 1}));
		System.out.println(T.solution(new int[]{2, 3, 1, 0, 1, 1, 2, 3, 1, 5, 1, 3, 1}));
		System.out.println(T.solution(new int[]{1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1}));
		System.out.println(T.solution(new int[]{1, 3, 2, 1, 1, 2, 3, 1, 3, 1, 2, 3, 5, 1, 5, 1, 2, 1, 1}));
	}
}
