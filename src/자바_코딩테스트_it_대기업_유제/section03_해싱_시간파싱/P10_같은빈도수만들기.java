package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.Arrays;
import java.util.HashMap;

public class P10_같은빈도수만들기 {

	public int[] solution(String s) {
		int[] answer = new int[5];
		int max = Integer.MIN_VALUE;
		Arrays.fill(answer, -1);

		HashMap<Character, Integer> sH = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			sH.put((char)(i + 97), 0);
		}

		for (char x : s.toCharArray()) {
			sH.put(x, sH.get(x) + 1);
			max = Math.max(max, sH.get(x));
		}

		for (Character key : sH.keySet()) {
			answer[key - 97] = max - sH.get(key);
		}

		return answer;
	}

	public static void main(String[] args) {
		P10_같은빈도수만들기 T = new P10_같은빈도수만들기();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}
