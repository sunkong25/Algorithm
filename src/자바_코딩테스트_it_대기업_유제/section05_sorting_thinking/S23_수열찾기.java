package 자바_코딩테스트_it_대기업_유제.section05_sorting_thinking;

import java.util.Arrays;
import java.util.HashMap;

public class S23_수열찾기 {
	public int[] solution(int[] nums) {
		int[] answer = new int[nums.length / 2];

		HashMap<Integer, Integer> h = new HashMap<>();
		for (int num : nums) {
			h.put(num, h.getOrDefault(num, 0) + 1);
		}
		Arrays.sort(nums);
		int i = 0;
		for (int num : nums) {
			if (h.get(num) == 0) {
				continue;
			}
			h.put(num, h.get(num) - 1);
			h.put(num * 2, h.get(num * 2) - 1);
			answer[i] = num;
			i++;
		}

		return answer;
	}

	public static void main(String[] args) {
		S23_수열찾기 T = new S23_수열찾기();
		System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
		System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
	}
}
