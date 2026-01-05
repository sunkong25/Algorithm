package 코딩테스트_대비_입문.string;

import java.util.ArrayList;
import java.util.Scanner;

public class S07_단어뒤집기 {
	/*public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();

		for (String s : str) {
			String input = new StringBuilder(s).reverse().toString();
			answer.add(input);
		}

		return answer;
	}*/
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();

		for (String s : str) {
			char[] c = s.toCharArray();
			int lt = 0, rt = c.length - 1;

			while (lt < rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;

				lt++;
				rt--;
			}
			answer.add(String.valueOf(c));
		}

		return answer;
	}

	public static void main(String[] args) {
		S07_단어뒤집기 T = new S07_단어뒤집기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] input = new String[n];

		for (int i = 0; i < n; i++) {
			input[i] = sc.next();
		}

		for (String str : T.solution(n, input)) {
			System.out.println(str);
		}
	}
}
