package 자바_코딩테스트_it_대기업_유제.section04_자료구조_활용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P16_최대길이연속수열 {
	public int solution(int[] nums) {
		int answer = 0;
		int cnt = 1;
		Set<Integer> set = new HashSet<>();
		for (int n : nums) {
			set.add(n);
		}

		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		list.add(0);

		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i + 1) - list.get(i) == 1) {
				cnt++;
			} else {
				cnt = 1;
			}
			answer = Math.max(answer, cnt);
		}

		return answer;
	}

	public static void main(String[] args) {
		P16_최대길이연속수열 T = new P16_최대길이연속수열();
		System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
		System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
		System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
		System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
	}
}
