package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

import java.util.HashMap;

public class S09_한번만사용한최초문자 {
	public int solution(String s) {
		HashMap<Character, Integer> sH = new HashMap<>();
		for (char x : s.toCharArray()) {
			sH.put(x, sH.getOrDefault(x, 0) + 1);
		}
		for (int i = 0; i < sH.size(); i++) {
			if (sH.get(s.charAt(i)) == 1) return i+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		S09_한번만사용한최초문자 T = new S09_한번만사용한최초문자();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}
