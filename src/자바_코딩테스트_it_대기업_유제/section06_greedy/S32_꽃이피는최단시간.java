package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.Arrays;

public class S32_꽃이피는최단시간 {
	public int solution(int[] plantTime, int[] growTime) {
		int answer = 0;
		int s = 0, e = 0;
		int n = plantTime.length;
		Integer[][] time = new Integer[n][2];

		for (int i = 0; i < n; i++) {
			time[i][0] = plantTime[i];
			time[i][1] = growTime[i];
		}
		Arrays.sort(time, (a, b) -> b[1] - a[1]);

		for (int i = 0; i < n; i++) {
			e = s + time[i][0] + time[i][1];
			answer = Math.max(answer, e);
			s += time[i][0];
		}

		return answer;
	}

	public static void main(String[] args) {
		S32_꽃이피는최단시간 T = new S32_꽃이피는최단시간();
		System.out.println(T.solution(new int[]{1, 3, 2}, new int[]{2, 3, 2}));
		System.out.println(T.solution(new int[]{2, 1, 4, 3}, new int[]{2, 5, 3, 1}));
		System.out.println(T.solution(new int[]{1, 1, 1}, new int[]{7, 3, 2}));
		System.out.println(T.solution(new int[]{5, 7, 10, 15, 7, 3, 5}, new int[]{6, 7, 2, 10, 15, 6, 7}));
		System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{7, 5, 4, 3, 2, 1, 6}));
	}
}
