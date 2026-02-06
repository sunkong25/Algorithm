package 자바_코딩테스트_it_대기업_유제.section06_greedy;

import java.util.Arrays;

public class P29_침몰하는타이타닉 {
	public int solution(int[] nums, int m){
		int answer = 0;
		int lt = 0, rt = nums.length - 1;
		Arrays.sort(nums);

		while (lt <= rt) {
			if (nums[lt] + nums[rt] > m) {
				rt--;
				answer++;
			} else {
				rt--;
				lt++;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args){
		P29_침몰하는타이타닉 T = new P29_침몰하는타이타닉();
		System.out.println(T.solution(new int[]{90, 50, 70, 100, 60}, 140));
		System.out.println(T.solution(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
		System.out.println(T.solution(new int[]{68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81}, 120));
	}
}
