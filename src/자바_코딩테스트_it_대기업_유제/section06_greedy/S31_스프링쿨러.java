package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.Arrays;

public class S31_스프링쿨러 {
	public int solution(int n, int[] nums) {
		int answer = 0;
		int[][] list = new int[n + 1][2];
		for (int i = 0; i <= n; i++) {
			list[i][0] = Math.max(0, i - nums[i]);
			list[i][1] = Math.min(n, i + nums[i]);
		}

		Arrays.sort(list, (a, b) -> a[0] - b[0]);

		int s = 0, e = 0, i = 0;
		while (i < list.length) {
			while (i <= n && list[i][0] <= s) {
				e = Math.max(list[i][1], e);
				i++;
			}
			answer++;
			if (e == n) {
				break;
			}
			if (s == e) {
				return -1;
			}
			s = e;
		}
		return answer;
	}

	public static void main(String[] args) {
		P31_스프링쿨러 T = new P31_스프링쿨러();
		System.out.println(T.solution(8, new int[]{1, 1, 1, 2, 1, 1, 2, 1, 1}));
		System.out.println(T.solution(4, new int[]{1, 2, 2, 0, 0}));
		System.out.println(T.solution(5, new int[]{2, 0, 0, 0, 0, 2}));
		System.out.println(T.solution(11, new int[]{1, 2, 3, 1, 2, 1, 1, 2, 1, 1, 1, 1}));
	}
}
