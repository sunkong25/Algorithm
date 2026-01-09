package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.Arrays;
import java.util.HashMap;

public class S10_같은빈도수만들기 {
	public int[] solution(String s){
		int[] answer = new int[5];

		HashMap<Character, Integer> sH = new HashMap<>();
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		String tmp = "abcde";

		for (char x : tmp.toCharArray()) {
			if (max < sH.getOrDefault(x, 0)) {
				max = sH.getOrDefault(x, 0);
			}
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i] = max - sH.getOrDefault(tmp.charAt(i), 0);
		}
		return answer;
	}

	public static void main(String[] args){
		S10_같은빈도수만들기 T = new S10_같은빈도수만들기();
		System.out.println(Arrays.toString(T.solution("aaabc")));
		System.out.println(Arrays.toString(T.solution("aabb")));
		System.out.println(Arrays.toString(T.solution("abcde")));
		System.out.println(Arrays.toString(T.solution("abcdeabc")));
		System.out.println(Arrays.toString(T.solution("abbccddee")));
	}
}
