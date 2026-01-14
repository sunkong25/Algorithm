package 자바_코딩테스트_it_대기업_유제.section04_자료구조_활용;

import java.util.HashSet;

public class S16_최대길이연속수열 {
	public int solution(int[] nums) {
		int answer = 0;
		HashSet<Integer> num = new HashSet<>();
		for (int n : nums) {
			num.add(n);
		}

		for (int n : num) {
			if (num.contains(n - 1)) {
				continue;
			}
			int cnt = 0;
			while (num.contains(n)) {
				cnt++;
				n++;
			}
			answer = Math.max(answer, cnt);
		}

		return answer;
	}

	public static void main(String[] args) {
		S16_최대길이연속수열 T = new S16_최대길이연속수열();
		System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
		System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
		System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
		System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
	}
}
