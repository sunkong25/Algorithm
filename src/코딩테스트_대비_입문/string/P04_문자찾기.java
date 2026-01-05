package 코딩테스트_대비_입문.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_문자찾기{
	public int solution(String input, String search) {
		int answer = 0 ;
		input = input.toUpperCase();
		search = search.toUpperCase();

		char[] c = input.toCharArray();

		for (char k : c) {
			if (search.equals(String.valueOf(k))) {
				answer++;
			}

		}

		return answer;
	}
	public static void main(String[] args) throws IOException {
		P04_문자찾기 T = new P04_문자찾기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String search = br.readLine();

		System.out.println(T.solution(input, search));
	}
}
