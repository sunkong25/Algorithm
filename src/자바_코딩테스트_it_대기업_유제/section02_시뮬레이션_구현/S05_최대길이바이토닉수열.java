package 자바_코딩테스트_it_대기업_유제.section02_시뮬레이션_구현;

import java.util.ArrayList;

public class S05_최대길이바이토닉수열 {
	public int solution(int[] nums) {
		int answer = 0;
		ArrayList<Integer> peaks = new ArrayList<>();
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
				peaks.add(i);
			}
		}

		for (int peak : peaks) {
			int count = 1;
			int i = peak, j = peak;
			while (i >= 1 && nums[i] > nums[i - 1]) {
				count++;
				i--;
			}
			while (j < nums.length-1 && nums[j] > nums[j + 1]) {
				count++;
				j++;
			}
			answer = Math.max(answer, count);
		}

		return answer;
	}

	public static void main(String[] args) {
		S05_최대길이바이토닉수열 T = new S05_최대길이바이토닉수열();
		System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
	}
}
