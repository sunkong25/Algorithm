package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.Arrays;

public class P32_꽃이피는최단시간 {
	public int solution(int[] plantTime, int[] growTime) {
		int answer = 0;
		int n = plantTime.length;
		Integer[][] time = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			time[i][0] = plantTime[i];
			time[i][1] = growTime[i];
		}
		Arrays.sort(time, (a, b) -> b[1] - a[1]);

		answer = time[0][0] + time[0][1];
		int[] sum = new int[n];
		sum[0] = time[0][0];

		for (int i = 1; i < n; i++) {
			sum[i] = sum[i-1] + time[i][0];
			int sumTime = 0;
			sumTime = sum[i] + time[i][1];

			answer = Math.max(answer, sumTime);
		}
		return answer;
	}

	public static void main(String[] args) {
		P32_꽃이피는최단시간 T = new P32_꽃이피는최단시간();
		System.out.println(T.solution(new int[]{1, 3, 2}, new int[]{2, 3, 2}));
		System.out.println(T.solution(new int[]{2, 1, 4, 3}, new int[]{2, 5, 3, 1}));
		System.out.println(T.solution(new int[]{1, 1, 1}, new int[]{7, 3, 2}));
		System.out.println(T.solution(new int[]{5, 7, 10, 15, 7, 3, 5}, new int[]{6, 7, 2, 10, 15, 6, 7}));
		System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{7, 5, 4, 3, 2, 1, 6}));
	}
}
