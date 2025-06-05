package 코딩테스트_대비_입문.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class S04_단어뒤집기 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answers = new ArrayList<>();

		//인덱스로 교환
		for (String s : str) {
			char[] c = s.toCharArray();
			int lt = 0, rt = s.length() - 1;
			while (lt < rt) {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++; rt--;
			}
			String temp = String.valueOf(c);
			answers.add(temp);
		}

		//StringBuilder 사용
		/*for (String answer : str) {
			String temp = new StringBuilder(answer).reverse().toString();
			answers.add(temp);
		}*/
		return answers;
	}

	public static void main(String[] args) {
		S04_단어뒤집기 T = new S04_단어뒤집기();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String[] str = new String[k];
		for (int i = 0; i < k; i++) {
			str[i] = sc.next();
		}
		for (String s : T.solution(k, str)) {
			System.out.println(s);
		}
	}
}
