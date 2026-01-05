package 코딩테스트_대비_입문.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P06_문자속단어 {
	public String solution(ArrayList<String> str) {
		String answer = "";

		for (String s : str) {
			if (answer.length() < s.length()) {
				answer = s;
			}
		}

		return answer;
	}
	public static void main(String[] args) throws IOException {
		P06_문자속단어 T = new P06_문자속단어();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		ArrayList<String> str = new ArrayList<>();

		while (st.hasMoreTokens()) {
			str.add(st.nextToken());
		}

		System.out.println(T.solution(str));
	}
}
