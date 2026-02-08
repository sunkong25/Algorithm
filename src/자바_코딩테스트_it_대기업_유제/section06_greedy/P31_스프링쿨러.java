package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.Arrays;

public class P31_스프링쿨러 {
	public int solution(int n, int[] nums) {
		int answer = 0;
		int[][] list = new int[n + 1][2];

		for (int i = 0; i < n; i++) {
			if (i - nums[i] < 0) {
				list[i][0] = 0;
				list[i][1] = i + nums[i];
			} else if (i + nums[i] > n) {
				list[i][0] = i - nums[i];
				list[i][1] = n;
			} else {
				list[i][0] = i - nums[i];
				list[i][1] = i + nums[i];
			}
		}

		Arrays.sort(list, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
		int s = 0, e = 0;
		for (int i = 0; i <= n; i++) {
			if (list[i][0] > s) {
				return -1;
			}
			while (i <= n && list[i][0] <= s) {
				e = Math.max(list[i][1], e);
				i++;
			}
			answer++;
			s = e;
			if (e == n) {
				break;
			}
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
