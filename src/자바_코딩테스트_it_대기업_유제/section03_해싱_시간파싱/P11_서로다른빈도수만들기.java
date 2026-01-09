package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.HashMap;

public class P11_서로다른빈도수만들기 {
	public int solution(String s) {
		int answer = 0;
		HashMap<Character, Integer> sH = new HashMap<>();
		boolean[] ch = new boolean[s.length()];

		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}

		for (char x : sH.keySet()) {
			int n = sH.get(x);
			for (int i = n; i >= 0; i--) {
				if (!ch[i]) {
					answer = answer + (n - i);
					if(i == 0) continue;
					ch[i] = true;
					break;
				}
			}

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
