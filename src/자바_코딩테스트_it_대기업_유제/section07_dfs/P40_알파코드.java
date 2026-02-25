package 자바_코딩테스트_it_대기업_유제.section07_dfs;

public class P40_알파코드 {
	int answer;

	public void DFS(int start, String s) {
		if (start == s.length()) {
			answer++;
		} else {
			for (int i = start; i < s.length(); i++) {
				String num = s.substring(start, i + 1);
				if (Integer.parseInt(num) < 1 || Integer.parseInt(num) > 26) return;
				DFS(i + 1, s);
			}
		}
	}

	public int solution(String s) {
		answer = 0;
		DFS(0, s);
		return answer;
	}

	public static void main(String[] args) {
		P40_알파코드 T = new P40_알파코드();
		System.out.println(T.solution("25114"));
		System.out.println(T.solution("23251232"));
		System.out.println(T.solution("21020132"));
		System.out.println(T.solution("21350"));
		System.out.println(T.solution("120225"));
		System.out.println(T.solution("232012521"));
	}
}
