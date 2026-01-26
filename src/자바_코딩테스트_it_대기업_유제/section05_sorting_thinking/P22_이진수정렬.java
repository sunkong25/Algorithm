package 자바_코딩테스트_it_대기업_유제.section05_sorting_thinking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P22_이진수정렬 {
	public int[] solution(int[] nums) {
		int[] answer = new int[nums.length];

		ArrayList<int[]> rank = new ArrayList<>();
		for (int x : nums) {
			int count = 0;
			int res = x;
			while (res > 0) {
				if (res % 2 == 1) {
					count++;
				}
				res = res / 2;
			}
			rank.add(new int[]{x, count});
		}
		rank.sort((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

		for (int i = 0; i < nums.length; i++) {
			answer[i] = rank.get(i)[0];
		}
		return answer;
	}

	public static void main(String[] args) {
		P22_이진수정렬 T = new P22_이진수정렬();
		System.out.println(Arrays.toString(T.solution(new int[]{5, 6, 7, 8, 9})));
		System.out.println(Arrays.toString(T.solution(new int[]{5, 4, 3, 2, 1})));
		System.out.println(Arrays.toString(T.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
	}
}
