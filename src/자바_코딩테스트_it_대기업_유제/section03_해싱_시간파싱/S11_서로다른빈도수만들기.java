package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.HashMap;
import java.util.HashSet;

public class S11_서로다른빈도수만들기 {
	public int solution(String s) {
		int answer = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
		HashSet<Integer> ch = new HashSet<>();

		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}

		for (char x : sH.keySet()) {
			while (ch.contains(sH.get(x))) {
				answer++;
				sH.put(x, sH.get(x) - 1);
			}
			if (sH.get(x) == 0) continue;
			ch.add(sH.get(x));
		}
		return answer;
	}

	public static void main(String[] args) {
		P11_서로다른빈도수만들기 T = new P11_서로다른빈도수만들기();
		System.out.println(T.solution("aaabbbcc"));
		System.out.println(T.solution("aaabbc"));
		System.out.println(T.solution("aebbbbc"));
		System.out.println(T.solution("aaabbbcccde"));
		System.out.println(T.solution("aaabbbcccdddeeeeeff"));
	}
}
