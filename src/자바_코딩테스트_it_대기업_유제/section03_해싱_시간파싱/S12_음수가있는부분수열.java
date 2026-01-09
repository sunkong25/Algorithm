package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.HashMap;

public class S12_음수가있는부분수열 {
	public int solution(int[] nums, int m) {
		int answer = 0;
		HashMap<Integer, Integer> iH = new HashMap<>();
		int sum = 0;
		iH.put(0, 1);
		for (int x : nums) {
			sum += x;
			if (iH.containsKey(sum - m)) {
				answer += iH.get(sum - m);
			}
			iH.put(sum, iH.getOrDefault(sum, 0) + 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		S12_음수가있는부분수열 T = new S12_음수가있는부분수열();
		System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
		System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));
		System.out.println(T.solution(new int[]{-1, 0, 1}, 0));
		System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));
	}
}
