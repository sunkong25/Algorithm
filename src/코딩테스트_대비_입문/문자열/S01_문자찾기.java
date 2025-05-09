package 코딩테스트_대비_입문.문자열;

import java.util.Scanner;

public class S01_문자찾기 {
	public int solution(String str, char t){
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);

		//for문 이용
		/*for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t) {
				answer++;
			}
		}*/

		//foreach문 이용
		for (char x : str.toCharArray()) {
			if (x == t) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		S01_문자찾기 T = new S01_문자찾기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(T.solution(str, c));
	}
}
