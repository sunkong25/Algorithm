package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.Arrays;

public class P30_이동횟수 {
	public int solution(int[] nums){
		int answer = 0;

		Arrays.sort(nums);
		int lt = 0, rt = nums.length-1;
		while (lt <= rt) {
			if (nums[lt] + nums[rt] <= 5) {
				rt--;
				lt++;
				answer++;
			} else {
				rt--;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args){
		P30_이동횟수 T = new P30_이동횟수();
		System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
		System.out.println(T.solution(new int[]{2, 3, 4, 5}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));
	}
}
