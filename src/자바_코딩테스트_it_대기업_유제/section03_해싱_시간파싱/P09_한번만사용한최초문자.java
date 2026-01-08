package 자바_코딩테스트_it_대기업_유제.section03_해싱_시간파싱;

public class P09_한번만사용한최초문자 {
	public int solution(String s){
		int answer = 0;
		boolean[] ch = new boolean[s.length()+1];

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					ch[i+1] = true;
					ch[j+1] = true;
				}
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (ch[i+1] == false) {
				answer = i+1;
				break;
			}
		}
		if (answer == 0) {
			return -1;
		}
		return answer;
	}

	public static void main(String[] args){
		P09_한번만사용한최초문자 T = new P09_한번만사용한최초문자();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}
